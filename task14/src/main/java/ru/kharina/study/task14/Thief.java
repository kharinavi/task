package ru.kharina.study.task14;

/*Thief – вор, который ворует самые ценные посылки и игнорирует все остальное.
Вор принимает в конструкторе переменную int – минимальную стоимость посылки, которую он будет воровать.
Также, в данном классе должен присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок,
которые он своровал. Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую,
такую же, только с нулевой ценностью и содержимым посылки "stones instead of {content}".
*/


public static class Thief  implements MailService{
    private int minPrice = 0;
    private int commonPrice = 0;
    public Thief(int minPrice){
        this.minPrice = minPrice;
    }

    public int getStolenValue(){
        return commonPrice;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage) {
            Package pac = ((MailPackage)mail).getContent();
            int price = pac.getPrice();
            if(price >= minPrice){
                commonPrice += price;
                mail = new MailPackage(mail.getFrom(), mail.getTo(),new Package("stones instead of " + pac.getContent(), 0));
            }
        }
        return mail;
    }
}
