package com.company;

public class TestBand {

    public void Band() {

        BandOb();
        BandOrchestraPit();

    }

    public void BandOrchestraPit() {
        OrchestraPit orchestrapit = new OrchestraPit();
        Violin v1 = new Violin();
        Violin v2 = new Violin("Stradivarius,","type1");
        Violin v3 = new Violin("Guarneri del Gesù", "type2");

        orchestrapit.MainOrchestra(v1);
        orchestrapit.MainOrchestra(v2);
        orchestrapit.MainOrchestra(v3);

        Violoncello vc1 = new Violoncello();
        orchestrapit.MainOrchestra(vc1);

        Message.DebugMessage(orchestrapit.toString());


    }


    public void BandOb() {

        Violin v1 = new Violin();

        Violin v2 = new Violin("Stradivarius,","type1");

        Message.DebugMessage(v2.toString());

        Violoncello vc1 = new Violoncello();

        System.out.println(vc1.toString());

        Bass b1 = new Bass();

        Viola vi1 = new  Viola();
        vi1.Move(4,"Viola"); 

        Harp h1 = new Harp();

        h1.Move(47, "Harp");


    }
}



