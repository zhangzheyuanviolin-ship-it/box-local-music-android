            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class IlII0olo {
                public static final LinkedHashMap I00000oIO;
                public static final Map I00000oOI;

                static {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             I00000oIO = linkedHashMap;
/* 22 */            I00000oOI(OlIl1I0oO1IO.I001IIilI0O, I00000oIO("java.util.ArrayList", "java.util.LinkedList"));
/* 41 */            I00000oOI(OlIl1I0oO1IO.I001IO000, I00000oIO("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
/* 64 */            I00000oOI(OlIl1I0oO1IO.I001i1O0Ol, I00000oIO("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
/* 71 */            Ill0IO ill0IO = new Ill0IO("java.util.function.Function");
/* 99 */            I00000oOI(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()), I00000oIO("java.util.function.UnaryOperator"));
/* 106 */           Ill0IO ill0IO2 = new Ill0IO("java.util.function.BiFunction");
/* 134 */           I00000oOI(new IOIOill(ill0IO2.I00000oOI(), ill0IO2.I00000oIO.I000II()), I00000oIO("java.util.function.BinaryOperator"));
/* 143 */           ArrayList arrayList = new ArrayList(linkedHashMap.size());
/* 158 */           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 191 */               arrayList.add(new OIoi0IIoi(((IOIOill) entry.getKey()).I00000oIO(), ((IOIOill) entry.getValue()).I00000oIO()));
                    }
/* 199 */           I00000oOI = O1Oii0O0loo.I000OiO(arrayList);
                }

                public static ArrayList I00000oIO(String... strArr) {
/* 4 */             ArrayList arrayList = new ArrayList(strArr.length);
/* 9 */             for (String str : strArr) {
/* 15 */                Ill0IO ill0IO = new Ill0IO(str);
/* 33 */                arrayList.add(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()));
                    }
/* 49 */            return arrayList;
                }

                public static void I00000oOI(IOIOill iOIOill, ArrayList arrayList) {
/* 9 */             for (Object obj : arrayList) {
/* 20 */                I00000oIO.put(obj, iOIOill);
                    }
                }
            }
