            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Iil1oo1 implements Function1 {
                public final int I00iOIl;
                public OOo0l0ii10l I00iiI;

                public Iil1oo1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OOo0l0ii10l oOo0l0ii10l = this.I00iiI;
                    switch (i) {
                        case 0:
/* 44 */                    IilI0O iilI0O = (IilI0O) obj;
/* 48 */                    if (!iilI0O.I00lll10) {
/* 50 */                        return OoIOloOIOI1l.I00iiI;
                            }
/* 55 */                    if (iilI0O.I00o101lO != null) {
/* 60 */                        IolioOO1.I0000Il00O("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                            }
/* 64 */                    iilI0O.I00o101lO = null;
/* 68 */                    oOo0l0ii10l.I00iOIl = oOo0l0ii10l.I00iOIl;
/* 70 */                    return OoIOloOIOI1l.I00iOIl;
                        case 1:
/* 34 */                    if (!((IoI1i1l) obj).I00o101lO) {
/* 41 */                        return OoIOloOIOI1l.I00iOIl;
                            }
/* 36 */                    oOo0l0ii10l.I00iOIl = false;
/* 38 */                    return OoIOloOIOI1l.I00iiO;
                        default:
/* 23 */                    if (((OiiO01I11iI) obj).I0001Ioi1lo.I00000oIO.I00000oIO.I00iiI.length() > 0) {
/* 25 */                        oOo0l0ii10l.I00iOIl = false;
                            }
/* 27 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
