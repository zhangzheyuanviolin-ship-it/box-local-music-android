            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
            public abstract class iOiiloIII0O {
                public static IIiOiI0il I00000oIO(IIiOOIoi0 iIiOOIoi0) {
/* 3 */             IIiOOI iIiOOI = new IIiOOI();
/* 11 */            iIiOOI.I0000Il00O = new Oi0OoOoOI1li();
/* 15 */            IIiOiI0il iIiOiI0il = new IIiOiI0il();
/* 20 */            IIiOOoOOll11 iIiOOoOOll11 = new IIiOOoOOll11();
/* 23 */            iIiOOoOOll11.I00ioIO = iIiOiI0il;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            iIiOiI0il.I00iiI = iIiOOoOOll11;
/* 35 */            iIiOiI0il.I00iOIl = new WeakReference(iIiOOI);
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            iIiOOI.I00000oOI = iIiOiI0il;
/* 46 */            iIiOOI.I00000oIO = iIiOOIoi0.getClass();
                    try {
/* 48 */                Object objAttachCompleter = iIiOOIoi0.attachCompleter(iIiOOI);
/* 52 */                if (objAttachCompleter == null) {
/* 59 */                    return iIiOiI0il;
                        }
/* 54 */                iIiOOI.I00000oIO = objAttachCompleter;
/* 56 */                return iIiOiI0il;
                    } catch (Exception e) {
/* 62 */                iIiOiI0il.I00iiI.I000OiO(e);
/* 77 */                return iIiOiI0il;
                    }
                }
            }
