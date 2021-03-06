/*
 * Conseil national de recherche Canada 2006/
 * National Research Council Canada 2006
 * 
 * Cr�� le / Created on Oct 24, 2006
 * par / by Benoit Farley
 * 
 */
package unitTests.fonts;

import fonts.FontAinunavik;
import junit.framework.TestCase;

public class FontAinunavikTest extends TestCase {

    /*
     * Test method for 'fonts.PoliceAinunavik.transcodeToUnicode(String, String)'
     */
    public void testTranscodeToUnicodeStringString() {
        String res = null;
        /*
         * pinasualaursimanngituq, atanngiijjutauniaqpuq, nunannguatigut, 
         * kinnguumajanginnik, tunngasugitsi, uqautivinngaa, kangiq&iniup,
         * ajjingiinngittuniinniaqtutik, angutiillu, arraanguulaaqtumi, 
         * gavamangannik, maligaliurvingmiingaarnikuuvugut, utarqiniq, 
         * utarqiinnaqtuq, qimirqujiujut, ilitarirquupuq, iniurqavik, itirqaaqpunga, 
         * ippigitsiaruk, taku&ugit, ikak&ak,
         * aippiqtaulluni, paippaamullu, taikkua, kaivallalluaqsunga, turaagait, 
         * tamaita, nalunairlugu, tungaliritsainartilugit, allait, nunalituqatsajait, 
         * sanirvaisimavugut, nutarait, qaisimalaurtutuit, tamakkuningaiglunit,
         * saanngainnaraktigu, tuqsunuurqaivuq
         * 
         * uvvaluunniit iilaak
         * Haamlaujunit angillivaalliarjussimajuumuppuq taakkuangu&&aqpuq
         * uumajur&aasuut i&uuraarjungnik sivu&iinnaq marruuliqtuunni iluunnaaguut
         * nunavuulimaaq sapuulutait tamatumuuna aaggaa aajiiqatigiinniq
         * siarrijaarviit unikkaaliulauqpiit iliilauqpisii kiinaujallariit
         * 
         * maqruuk
         */
        String [][] words = {
                // n+ngi: pinasualaursimanngituq
                {"WNhxMs3ym1qg6","\u1431\u14c7\u14f1\u140a\u14da\u1405\u1550\u14ef\u14aa\u1671\u1450\u1585"},
                // n+ngii: atanngiijjutauniaqpuq
                {"xb8�0Jbsix6S6","\u140a\u1455\u1672\u153e\u152a\u1455\u1405\u14c2\u140a\u1585\u1433\u1585"},
                // n+ngu: nunannguatigut
                {"kN8axtA5","\u14c4\u14c7\u1673\u140a\u144e\u148d\u1466"},
                // n+nguu: kinnguumajanginnik
                {"r8�m/q8i4","\u146d\u1674\u14aa\u152d\u158f\u14d0\u14c2\u1483"},
                // n+nga: tunngasugitsi
                {"g8zhQ5y","\u1450\u1675\u14f1\u148b\u1466\u14ef"},
                // n+ngaa: uqautivinngaa
                {"scst[8�","\u1405\u1583\u1405\u144e\u1555\u1676"},
                // ngi: kangiq&iniup
                {"vq6�is2","\u1472\u158f\u1585\u15a0\u14c2\u1405\u1449"},
                // ngii: ajjingiinngittuniinniaqtutik
                {"x0p�8q5g�8ix6gt4","\u140a\u153e\u1528\u1590\u1671\u1466\u1450\u14c3\u14d0\u14c2\u140a\u1585\u1450\u144e\u1483"},
                // ngu: angutiillu
                {"xa�9l","\u140a\u1591\u144f\u14ea\u14d7"},
                // nguu: arraanguulaaqtumi
                {"x3��6gu","\u140a\u1550\u154c\u1592\u14db\u1585\u1450\u14a5"},
                // nga: gavamangannik
                {"Z?mz8i4","\u1490\u1559\u14aa\u1593\u14d0\u14c2\u1483"},
                // ngaa: maligaliurvingmiingaarnikuuvugut
                {"moZos3[1��3i�KA5","\u14aa\u14d5\u1490\u14d5\u1405\u1550\u1555\u1595\u14a6\u1594\u1550\u14c2\u1470\u1557\u148d\u1466"},
                
                // rqi: utarqiniq
                {"sb3ei6","\u1405\u1455\u1585\u146d\u14c2\u1585"},
                // rqii: utarqiinnaqtuq
                {"sb3�8N6g6","\u1405\u1455\u1585\u146e\u14d0\u14c7\u1585\u1450\u1585"},
                // qri: niqriku
                {"i6Ef","\u14c2\u1550\u1546\u146f"},
                // qrii: taqriijaamit
                {"b6��u5","\u1455\u1550\u1547\u152e\u14a5\u1466"},
                // qqi: utaqqiniq
                {"sb6ei6","\u1405\u1455\u1585\u146d\u14c2\u1585"},
                // qqii: utaqqiinnaqtuq
                {"sb6�8N6g6","\u1405\u1455\u1585\u146e\u14d0\u14c7\u1585\u1450\u1585"},
                // rqu: qimirqujiujut
                {"eu3dpsJ5","\u157f\u14a5\u1585\u146f\u1528\u1405\u152a\u1466"},
                // rquu: ilitarirquupuq
                {"wobE3�S6","\u1403\u14d5\u1455\u1546\u1585\u1470\u1433\u1585"},
                // qru: qimiqruagait
                {"eu6DxZw5","\u157f\u14a5\u1550\u1548\u140a\u1490\u1403\u1466"},
                // qruu: maqruuk
                {"m6�4","\u14aa\u1550\u1549\u1483"},
                // qqu: qimiqqujiujut
                {"eu6dpsJ5","\u157f\u14a5\u1585\u146f\u1528\u1405\u152a\u1466"},
                // qquu: ilitariqquupuq
                {"wobE6�S6","\u1403\u14d5\u1455\u1546\u1585\u1470\u1433\u1585"},
                // rqa: iniurqavik
                {"wis3c[4","\u1403\u14c2\u1405\u1585\u1472\u1555\u1483"},
                // rqaa: itirqaaqpunga
                {"wt3�6Sz","\u1403\u144e\u1585\u1473\u1585\u1433\u1593"},
                // qra: angiqrapaa
                {"xq6C�","\u140a\u158f\u1550\u154b\u1439"},
                // qraa: aqraagu
                {"x6�A","\u140a\u1550\u154c\u148d"},
                // qqa: iniuqqavik
                {"wis6c[4","\u1403\u14c2\u1405\u1585\u1472\u1555\u1483"},
                // qqaa: itiqqaaqpunga
                {"wt6�6Sz","\u1403\u144e\u1585\u1473\u1585\u1433\u1593"},

                // ru: ippigitsiaruk
                {"w2WQ5yxD4","\u1403\u1449\u1431\u148b\u1466\u14ef\u140a\u1548\u1483"},
                // &u: taku&ugit
                {"bf�Q5","\u1455\u146f\u15a2\u148b\u1466"},
                // &a: ikak&ak
                {"wv4�4","\u1403\u1472\u1483\u15a4\u1483"},
                // luu, nii, v: uvvaluunniit
                {"s{?�8�5","\u1405\u155d\u1559\u14d8\u14d0\u14c3\u1466"},
                // ii, laa: iilaak
                {"\u2122�4","\u1404\u14db\u1483"},
                {"\u0099�4","\u1404\u14db\u1483"},
                // H, aa, m: Haamlaujunit
                {"��7MsJi5","\u157c\u140b\u14bb\u14da\u1405\u152a\u14c2\u1466"},
                // vaa, s, juu: angillivaalliarjussimajuumuppuq
                {"xq9o�9ox3J+ym�j2S6",
                    "\u140a\u158f\u14ea\u14d5\u155a\u14ea\u14d5\u140a\u1550\u152a\u1505\u14ef\u14aa\u152b\u14a7\u1449\u1433\u1585"},
                // taa, &: taakkuangu&&aqpuq
                {"�4fxa՟6S6","\u1456\u1483\u146f\u140a\u1591\u15a6\u15a4\u1585\u1433\u1585"},
                // uu, &aa, suu: uumajur&aasuut
                {"�mJ3�5","\u1406\u14aa\u152a\u1550\u15a5\u14f2\u1466"},
                // &uu, raa, ng: i&uuraarjungnik
                {"w��3J1i4","\u1403\u15a3\u154c\u1550\u152a\u1595\u14c2\u1483"},
                // &ii: sivu&iinnaq
                {"yK�8N6","\u14ef\u1557\u15a1\u14d0\u14c7\u1585"},
                // ruu, tuu: marruuliqtuunni
                {"m3�o6�8i","\u14aa\u1550\u1549\u14d5\u1585\u1451\u14d0\u14c2"},
                // luu, naa, guu: iluunnaaguut
                {"w�8��5","\u1403\u14d8\u14d0\u14c8\u148e\u1466"},
                // vuu, maa: nunavuulimaaq
                {"kN�o�6","\u14c4\u14c7\u1558\u14d5\u14ab\u1585"},
                // puu: sapuulutait
                {"n�lbw5","\u14f4\u1434\u14d7\u1455\u1403\u1466"},
                // muu: tamatumuuna
                {"bmg�N","\u1455\u14aa\u1450\u14a8\u14c7"},
                // aa, gaa: aagaa
                {"�=�","\u140b\u14a1\u1491"},
                // aa, jii, gii: aajiiqatigiinniq
                {"��ct�8i6","\u140b\u1529\u1583\u144e\u148c\u14d0\u14c2\u1585"},
                // jaa, vii: siarrijaarviit
                {"yx3E�3�5","\u14ef\u140a\u1550\u1546\u152e\u1550\u1556\u1466"},
                // kaa, pii: unikkaaliulauqpiit
                {"si4�osMs6�5","\u1405\u14c2\u1483\u1473\u14d5\u1405\u14da\u1405\u1585\u1432\u1466"},
                // lii, sii: iliilauqpisii
                {"w�Ms6W�","\u1403\u14d6\u14da\u1405\u1585\u1431\u14f0"},
                // kii, rii: kiinaujallariit
                {"�NsI9M�5","\u146e\u14c7\u1405\u152d\u14ea\u14da\u1547\u1466"},
        };

        String wordsAI[][] = {
                // ai: aippiqtaulluni
                {"xw2W6bs9li","�2W6bs9li",
                    "\u140a\u1403\u1449\u1431\u1585\u1455\u1405\u14ea\u14d7\u14c2",
                    "\u1401\u1449\u1431\u1585\u1455\u1405\u14ea\u14d7\u14c2"
                },
                // pai: paippaamullu
                {"Xw2�j9l","�2�j9l",
                    "\u1438\u1403\u1449\u1439\u14a7\u14ea\u14d7",
                    "\u142f\u1449\u1439\u14a7\u14ea\u14d7"
                },
                // tai: taikkua
                {"bw4fx","�4fx",
                    "\u1455\u1403\u1483\u146f\u140a",
                    "\u144c\u1483\u146f\u140a"
                },
                // kai: kaivallalluaqsunga
                {"vw?9M9lx6hz","�?9M9lx6hz",
                    "\u1472\u1403\u1559\u14ea\u14da\u14ea\u14d7\u140a\u1585\u14f1\u1593",
                    "\u146b\u1559\u14ea\u14da\u14ea\u14d7\u140a\u1585\u14f1\u1593"
                 },
                // gai: turaagait
                {"g�Zw5","g��5",
                     "\u1450\u154c\u1490\u1403\u1466",
                     "\u1450\u154c\u1489\u1466"
                },
                // mai: tamaita
                {"bmwb","b�b",
                    "\u1455\u14aa\u1403\u1455",
                    "\u1455\u14a3\u1455"
                },
                // nai: nalunairlugu
                {"NlNw3lA","Nl�3lA",
                    "\u14c7\u14d7\u14c7\u1403\u1550\u14d7\u148d",
                    "\u14c7\u14d7\u14c0\u1550\u14d7\u148d"
                },
                // sai: tungaliritsainartilugit
                {"gzoE5nwN3tlQ5","gzoE5�N3tlQ5",
                    "\u1450\u1593\u14d5\u1546\u1466\u14f4\u1403\u14c7\u1550\u144e\u14d7\u148b\u1466",
                    "\u1450\u1593\u14d5\u1546\u1466\u14ed\u14c7\u1550\u144e\u14d7\u148b\u1466"
                 },
                // lai: allait
                {"x9Mw5","x9�5",
                    "\u140a\u14ea\u14da\u1403\u1466",
                    "\u140a\u14ea\u14d3\u1466",
                 },
                // jai: nunalituqatsajait
                {"kNogc5n/w5","kNogc5n�5",
                     "\u14c4\u14c7\u14d5\u1450\u1583\u1466\u14f4\u152d\u1403\u1466",
                     "\u14c4\u14c7\u14d5\u1450\u1583\u1466\u14f4\u1526\u1466"
                },
                // vai: sanirvaisimavugut
                {"ni3?wymKA5","ni3�ymKA5",
                    "\u14f4\u14c2\u1550\u1559\u1403\u14ef\u14aa\u1557\u148d\u1466",
                    "\u14f4\u14c2\u1550\u1553\u14ef\u14aa\u1557\u148d\u1466"
                },
                // rai: nutarait
                {"kbCw5","kb�5",
                    "\u14c4\u1455\u154b\u1403\u1466",
                    "\u14c4\u1455\u1542\u1466"
                 },
                // qai: qaisimalaurtutuit
                {"cwymMs3ggw5","�ymMs3ggw5",
                     "\u1583\u1403\u14ef\u14aa\u14da\u1405\u1550\u1450\u1450\u1403\u1466",
                     "\u166f\u14ef\u14aa\u14da\u1405\u1550\u1450\u1450\u1403\u1466"
                },
                // ngai: tamakkuningaiglunit
                {"bm4fizw=li5","bm4fi�=li5",
                    "\u1455\u14aa\u1483\u146f\u14c2\u1593\u1403\u14a1\u14d7\u14c2\u1466",
                    "\u1455\u14aa\u1483\u146f\u14c2\u1670\u14a1\u14d7\u14c2\u1466"
                },
                // n+ngai: saanngainnaraktigu
                {"�8zw8NC4tA","�8�8NC4tA",
                    "\u14f5\u1675\u1403\u14d0\u14c7\u154b\u1483\u144e\u148d",
                    "\u14f5\u1596\u1489\u14d0\u14c7\u154b\u1483\u144e\u148d"
                },
                // rqai: tuqsunuurqaivuq
                {"g6h�3cwK6","g6h�3�K6",
                    "\u1450\u1585\u14f1\u14c5\u1585\u1472\u1403\u1557\u1585",
                    "\u1450\u1585\u14f1\u14c5\u1585\u146b\u1557\u1585"
                },
                // qrai: ikaqrait
                {"wv6Cw5","wv6�5",
                    "\u1403\u1472\u1550\u154b\u1403\u1466",
                    "\u1403\u1472\u1550\u1542\u1466"
                },
                // qqai: tuqsunuuqqaivuq
                {"g6h�6cwK6","g6h�6�K6",
                    "\u1450\u1585\u14f1\u14c5\u1585\u1472\u1403\u1557\u1585",
                    "\u1450\u1585\u14f1\u14c5\u1585\u146b\u1557\u1585"
                },
    };
        for (int i=0; i<words.length; i++) {
            String str = words[i][0];
            String targ = words[i][1];
            res = FontAinunavik.transcodeToUnicode(str,null);
            assertEquals("1. "+res+" au lieu de "+targ,targ,res);
        }
        for (int i=0; i<wordsAI.length; i++) {
            String str = wordsAI[i][0];
            String targ = wordsAI[i][2];
            res = FontAinunavik.transcodeToUnicode(str,null);
            assertEquals("2a. "+res+" au lieu de "+targ,targ,res);
            str = wordsAI[i][1];
            res = FontAinunavik.transcodeToUnicode(str,null);
            assertEquals("2b. "+res+" au lieu de "+targ,targ,res);
        }
        for (int i=0; i<wordsAI.length; i++) {
            String str = wordsAI[i][0];
            String targ = wordsAI[i][3];
            res = FontAinunavik.transcodeToUnicode(str,"aipaitai");
            assertEquals("3a. "+res+" au lieu de "+targ,targ,res);
            str = wordsAI[i][1];
            res = FontAinunavik.transcodeToUnicode(str,"aipaitai");
            assertEquals("3b. "+res+" au lieu de "+targ,targ,res);
        }

    }

    /*
     * Test method for 'fonts.PoliceAinunavik.transcodeFromUnicode(String)'
     */
    public void testTranscodeFromUnicode() {

    }

}
