package net.ukr.kiyashko.lab5;

public class Main {
    public static void main(String args[]) {
        //создаем нашы объекты аквариума
        Akvarium akvarium = new Akvarium(0.6, 0.5, 0.4);
        Filtr filtr = new Filtr(400.0, 6.0);
        Fish fish1 = new Fish("grey", 8.0, "som");
        Fish fish2 = new Fish("grey", 9.0, "som");
        Fish fish3 = new Fish("grey", 9.5, "som");
        Fish fish4 = new Fish("red", 9.0, "mechenosec");
        Fish fish5 = new Fish("red", 10.5, "mechenosec");
        Fish fish6 = new Fish("red", 8.3, "mechenosec");
        Fish fish7 = new Fish("blu", 4.5, "neon");
        Fish fish8 = new Fish("blu", 5.0, "neon");
        Fish fish9 = new Fish("blu", 4.3, "neon");
        // Fish fish =new Fish(cvet, dlina,nazva);
        String[][] arrFish = new String[3][9];

        String[] arrFishCvet = new String[9];
        arrFishCvet = new String[]{"grey", "grey", "grey", "red", "red", "red", "blu", "blu", "blu"};
        double[] arrFishDlina = new double[9];
        arrFishDlina = new double[]{8.0, 9.0, 9.5, 9.0, 10.5, 8.3, 4.5, 5.0, 4.3};
        String[] arrFishNazva = new String[9];
        arrFishNazva = new String[]{"som", "som", "som", "mechenosec", "mechenosec", "mechenosec", "neon", "neon", "neon"};

        Decor decor = new Decor("green", 20.0);
        Plants plants = new Plants("yellow", 15.0);
        Lamp lamp1 = new Lamp(12.0, 3000.0, true);
        Lamp lamp2 = new Lamp(6.0, 6000.0, false);
        Kormushka kormushka = new Kormushka(30.0, "jrite");


        double raschetMesStoimistiSoderjan;
        double energopotreblenieAkvariuma;
        double summaEnergopotreblenieAkvariuma;
        double mesStoimVody;
        double mesStoimostKorma;
//заполняем наш аквариум массив рыбками
   /*     Fish [] [] arrFish=new Fish[3][10];
        arrFish[0][0] =  fish;
        arrFish[1][0]= new Fish("grey", 9.0,"som");
        arrFish[2][0]= new Fish("grey", 9.5,"som");
        arrFish[3][0]= new Fish("red", 9.0,"mechenosec");
        arrFish[4][0]= new Fish("red", 10.5,"mechenosec");
        arrFish[5][0]= new Fish("red", 9.2,"mechenosec");
        arrFish[6][0]= new Fish("red", 8.3,"mechenosec");
        arrFish[7][0]= new Fish("blu", 4.5,"neon");
        arrFish[8][0]= new Fish("blu", 5.0,"neon");
        arrFish[9][0]= new Fish("blu", 4.3,"neon");*/

//вычислим объем необходимой воды для наших рыбок, исходя из потребности на рыбку до 5см -1л,>5-6л
        double v1 = 0;

        for (int i = 0; i < arrFishDlina.length; i++) {
            if (arrFishDlina[i] > 5) {
                v1 = v1 + 6;
            } else
                v1 = v1 + 1;
        }
        System.out.println("Рыбкам будет достаточно - " + v1 + " литров воды");
        if (akvarium.getObyem() < v1) {
            System.out.println("Для комфортного обитания вашим рыбкам нужно " + v1 + " литров воды, а объем вашего аквариума: " +
                    akvarium.getObyem() + " литров. Вам надо аквариум побольше или уменьшите количество рыбок");
        }
//Расчет мощности фильтра V*3
        // System.out.println("Для аквариума необходим фильтр мощностью : "+akvarium.getMoshnost()+" литров в час");
        if (akvarium.getMoshnost() > filtr.getMoshnost()) {
            System.out.println("Мощность фильтрации для аквариума должна быть на уровне " + akvarium.getMoshnost() +
                    " литров в час, установленный фильтр обеспечивает фильтрацию на уровне " +
                    filtr.getMoshnost() + " лтров в час. Необходимо заменить фильтр на более мощный.");
        } else System.out.println("Мощность фильтрации для аквариума должна быть на уровне " + akvarium.getMoshnost() +
                " литров в час, установленный фильтр обеспечивает фильтрацию на уровне " +
                filtr.getMoshnost() + " лтров в час. Ваш аквариум будет в чистоте.");

//Расчет количества корма на день. 3 грамма корма на рыбку 2 раза в день.
        int kormGramm = arrFishDlina.length * 3 * 2;
        System.out.println("Рыбкам нужно " + kormGramm + " грамм корма ежедневно.Вместительность вашей кормушки : "
                + kormushka.getVmestitelnost() + " грамм");
        //Расчет стоимости обслуживания аквариума в месяц, если:
        //	- 1 кВт электроэнергии стоит 1.2 грн
        //	- 1 м.куб воды стоит 5.89 грн
        //	- 100г корма стоит 125 грн
        //	- Каждый месяц необходимо менять 1/4 часть объема
        //	- Аквариум освещается 8 часов дневным светом и 4 часа ночным

        energopotreblenieAkvariuma = filtr.getPotreblenie() * 24 * 30 / 1000 + lamp1.getPotreblenie() * 8 * 30 / 1000 + lamp2.getPotreblenie() * 4 * 30 / 1000;
        summaEnergopotreblenieAkvariuma = energopotreblenieAkvariuma * 1.2;
        mesStoimostKorma = kormGramm * 30 * 1.25;
        mesStoimVody = akvarium.getObyem() / 4 / 1000 * 5.89;
        raschetMesStoimistiSoderjan = summaEnergopotreblenieAkvariuma + mesStoimVody + mesStoimostKorma;
        System.out.println("Месячное энергопотребление аквариума: " + energopotreblenieAkvariuma + " кВт, что составляет " +
                summaEnergopotreblenieAkvariuma + " грн");
        System.out.println("Месячная стоимость воды : " + mesStoimVody + " грн");
        System.out.println("Стоимость корма на месяц: " + mesStoimostKorma + " грн");
        System.out.println("Всего затраты составляют: " + raschetMesStoimistiSoderjan + " грн ежемесячно.");


        System.out.println(akvarium.getObyem());
        System.out.println(v1);
    }
}
