package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        List<Email> sentEmails2 = filterByPredicate(emailList, Email::isSent);
        List<Email> sentEmails = filterEmailsSent(emailList);
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        System.out.println();
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails2);
        System.out.println();
//        filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails = filterEmailsBySenderOrRecipient(emailList, "bart@example.com");
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails);
        System.out.println();
        List<Email> bartEmails2 = filterByPredicate(emailList, email -> email.filterMail("bart@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails2);
    }

    private static List<Email> filterEmailsBySenderOrRecipient(List<Email> emails, String emailAddress) {
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSender().equals(emailAddress) || email.getRecipient().equals(emailAddress))
                filteredEmails.add(email);
        }
        return filteredEmails;
    }

    private static List<Email> filterEmailsSent(List<Email> emails) {
        List<Email> sentEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.isSent())
                sentEmails.add(email);
        }
        return sentEmails;
    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }

    private static List<Email> filterByPredicate(List<Email> list, Predicate<Email> predicate){
        List<Email> result = new ArrayList<>();
        for (Email t : list) {
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}