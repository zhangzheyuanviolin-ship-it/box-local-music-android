            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class OOi1I1iiOii {
                public static final OOiI0liIo1ii I00000oIO;

                static {
/* 3 */             HashMap map = new HashMap();
/* 8 */             HashMap map2 = new HashMap();
/* 15 */            map.put(OOi1I1iiOii.class, I1ilIoo0O10I.I00000oIO);
/* 18 */            map2.remove(OOi1I1iiOii.class);
/* 25 */            map.put(O1lOll.class, I1ilIo.I00000oIO);
/* 28 */            map2.remove(O1lOll.class);
/* 35 */            map.put(O1lOl1101O.class, I1ilIOi.I00000oIO);
/* 38 */            map2.remove(O1lOl1101O.class);
/* 45 */            HashMap map3 = new HashMap(map);
/* 50 */            HashMap map4 = new HashMap(map2);
/* 53 */            OOiI0liIo1ii oOiI0liIo1ii = new OOiI0liIo1ii();
/* 56 */            oOiI0liIo1ii.I00000oIO = map3;
/* 58 */            oOiI0liIo1ii.I00000oOI = map4;
/* 62 */            oOiI0liIo1ii.I0000Il00O = OOiI0liIo1ii.I0000O;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            I00000oIO = oOiI0liIo1ii;
                }
            }
