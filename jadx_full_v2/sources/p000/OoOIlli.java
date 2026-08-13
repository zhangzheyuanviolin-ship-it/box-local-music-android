            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class OoOIlli implements Function1 {
                public final int I00iOIl;
                public IOiOol0 I00iiI;

                public OoOIlli(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             IOiOol0 iOiOol0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 69 */                    int iIntValue = ((Number) obj).intValue();
/* 75 */                    IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) iOiOol0.I00iiI;
/* 81 */                    IOIOill iOIOillI00000oIO = l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO1.I00iiO, iIntValue);
/* 85 */                    boolean z = iOIOillI00000oIO.I0000Il00O;
/* 89 */                    Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) iiOili0lOO1.I00iiI;
/* 91 */                    if (!z) {
/* 122 */                       return ilOOOOloO.I00000oOI((OI0010oo1o) ii10lIo0l1.I00000oOI, iOIOillI00000oIO);
                            }
/* 97 */                    I1ooIoloo0 i1ooIoloo0 = ((IOIOiIiilIl) ii10lIo0l1.I0010o).I00000oOI;
/* 101 */                   IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 104 */                   iOIOOIoOIO.I00000oIO = iOIOillI00000oIO;
/* 106 */                   iOIOOIoOIO.I00000oOI = null;
/* 108 */                   VarHandle.storeStoreFence();
/* 115 */                   return (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO);
                        case 1:
/* 26 */                    int iIntValue2 = ((Number) obj).intValue();
/* 32 */                    IiOili0lOO1 iiOili0lOO12 = (IiOili0lOO1) iOiOol0.I00iiI;
/* 38 */                    IOIOill iOIOillI00000oIO2 = l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO12.I00iiO, iIntValue2);
/* 44 */                    if (iOIOillI00000oIO2.I0000Il00O) {
/* 3 */                         return null;
                            }
/* 55 */                    IOIiO1lIl0l iOIiO1lIl0lI00000oOI = ilOOOOloO.I00000oOI((OI0010oo1o) ((Ii10lIo0l1) iiOili0lOO12.I00iiI).I00000oOI, iOIOillI00000oIO2);
/* 61 */                    if (iOIiO1lIl0lI00000oOI instanceof IiOoI0oI) {
/* 64 */                        return (IiOoI0oI) iOIiO1lIl0lI00000oOI;
                            }
/* 3 */                     return null;
                        default:
/* 19 */                    return lIOOli.I0000O((OOi001oo1OOI) obj, (Oi0Oooi) ((IiOili0lOO1) iOiOol0.I00iiI).I00ilI0I1);
                    }
                }
            }
