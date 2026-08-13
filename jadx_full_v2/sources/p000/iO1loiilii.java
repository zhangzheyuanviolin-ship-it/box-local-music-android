            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class iO1loiilii {
                public static final o11IoIoIOI0l I00000oIO = new o11IoIoIOI0l(1);
                public static final o11O11o I00000oOI = new o11O11o(1);

                public static o01l1ioOo0 I00000oIO(Set set) {
/* 3 */             o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 11 */            o01l1iooo0.I00iOIl = new HashMap();
/* 18 */            o01l1iooo0.I00iiI = new HashMap();
/* 22 */            o01l1iooo0.I00iiO = I00000oIO;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            o01l1iooo0.I00iio = I00000oOI;
/* 31 */            Iterator it = set.iterator();
/* 39 */            while (it.hasNext()) {
/* 45 */                o0oooliI o0ooolii = (o0oooliI) it.next();
/* 49 */                HashMap map = (HashMap) o01l1iooo0.I00iiI;
/* 53 */                HashMap map2 = (HashMap) o01l1iooo0.I00iOIl;
/* 57 */                liOOo1l1O.I00000oIO("key", o0ooolii);
/* 60 */                boolean z = o0ooolii.I0000Il00O;
/* 62 */                if (!z) {
/* 82 */                    map.remove(o0ooolii);
/* 87 */                    map2.put(o0ooolii, o01l1ioOo0.I00ilO0);
                        } else {
/* 64 */                    if (!z) {
/* 77 */                        I000II.I000iOII("key must be repeating");
/* 80 */                        return null;
                            }
/* 66 */                    map2.remove(o0ooolii);
/* 71 */                    map.put(o0ooolii, o01l1ioOo0.I00io1l);
                        }
                    }
/* 168 */           return o01l1iooo0;
                }
            }
