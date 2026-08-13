            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class l0llIoloo {
                public static O0Iioo1lO0o I00000oIO(IllOOo00lI illOOo00lI) {
/* 1 */             List list = O0IioooOl1.I00000oIO;
/* 19 */            String name = ((IOIO10iOi1) OOoOl0i.I00000oIO.I00000oOI(illOOo00lI.getClass())).I001l0I00().getName();
/* 27 */            Iterator it = O0IioooOl1.I00000oIO.iterator();
                    while (true) {
/* 35 */                if (!it.hasNext()) {
                            break;
                        }
/* 45 */                int iI001i1lo1io = OlOoOIi0o.I001i1lo1io(name, (String) it.next(), 0, false, 6);
/* 50 */                if (iI001i1lo1io != -1) {
/* 52 */                    name = name.substring(0, iI001i1lo1io);
                            break;
                        }
                    }
/* 62 */            if (System.getProperty("kotlin-logging-to-android-native") != null) {
/* 67 */                IliIlOOIoIo iliIlOOIoIo = new IliIlOOIoIo(1);
/* 70 */                iliIlOOIoIo.I00iiI = name;
/* 72 */                VarHandle.storeStoreFence();
/* 75 */                return iliIlOOIoIo;
                    }
/* 76 */            O1I1OOiol o1I1OOiolI00000oOI = O1I1lilOlO0I.I00000oOI(name);
/* 82 */            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 85 */            iiolilo0iiil.I00iOIl = o1I1OOiolI00000oOI;
/* 87 */            VarHandle.storeStoreFence();
/* 186 */           return iiolilo0iiil;
                }
            }
