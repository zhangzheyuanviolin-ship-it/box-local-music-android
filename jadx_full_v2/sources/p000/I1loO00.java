            package p000;

            import android.view.View;
            import java.util.Iterator;
            import java.util.List;
            import java.util.WeakHashMap;
            import java.util.concurrent.ExecutorService;
            import kotlin.jvm.functions.Function1;
            
            public final class I1loO00 implements IiiO1li1 {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public I1loO00(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void I00000oOI() throws Exception {
                    switch (this.I00000oIO) {
                        case 0:
/* 336 */                   ((I1lo10iOI) this.I00000oOI).I00000oOI((IOioOOiI0l00) this.I0000Il00O);
                            break;
                        case 1:
/* 324 */                   ((OI1OloOIO1O) this.I00000oOI).I00ioIO.I000OiO.I00ooIo0((Iii0IloIo1) this.I0000Il00O);
                            break;
                        case 2:
/* 308 */                   ((O0oiOi) this.I00000oOI).I000iOII().I00ooIo0((I01oi1lO0O1o) this.I0000Il00O);
                            break;
                        case 3:
/* 292 */                   ((IolIiIl) this.I00000oOI).I00000oIO.I000iOII((IolIOll) this.I0000Il00O);
                            break;
                        case 4:
/* 278 */                   ((O0o0oil1l1o) this.I00000oOI).I00iiO.I000iOII(this.I0000Il00O);
                            break;
                        case 5:
/* 266 */                   ((O0oiOi) this.I00000oOI).I000iOII().I00ooIo0((OilIoI11) this.I0000Il00O);
                            break;
                        case 6:
/* 227 */                   ExecutorService executorService = (ExecutorService) this.I00000oOI;
/* 237 */                   OOIl1Io0 oOIl1Io0 = (OOIl1Io0) ((OI10i0Il) this.I0000Il00O).getValue();
/* 239 */                   if (oOIl1Io0 != null) {
/* 241 */                       oOIl1Io0.I00000oOI();
                            }
/* 248 */                   if (!executorService.isShutdown()) {
/* 250 */                       executorService.shutdown();
                                break;
                            }
                            break;
                        case 7:
/* 196 */                   Iterator it = ((List) ((OlO01l1oOil) this.I00000oOI).getValue()).iterator();
/* 204 */                   while (it.hasNext()) {
/* 220 */                       ((IOl00O1iI1Oo) this.I0000Il00O).I00000oOI().I00000oOI((OI1OloOIO1O) it.next());
                            }
                            break;
                        case 8:
/* 174 */                   ((IOiolo0oi0o) this.I00000oOI).I0001Ioi1lo();
/* 181 */                   ((OII11i) this.I0000Il00O).I0000oI00 = null;
                            break;
                        case 9:
/* 166 */                   ((I1lo10iOI) this.I00000oOI).I00000oOI((IOl0OoOIliI1) this.I0000Il00O);
                            break;
                        case 10:
/* 140 */                   OiioIllIl oiioIllIl = (OiioIllIl) this.I00000oOI;
/* 148 */                   if (oiioIllIl.I00000oOI == ((Oiill0lI1il1) this.I0000Il00O)) {
/* 150 */                       oiioIllIl.I00000oOI = null;
/* 154 */                       oiioIllIl.I00000oIO.setValue(null);
                                break;
                            }
                            break;
                        case 11:
/* 110 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00000oOI;
/* 116 */                   OOIII1oOoolO oOIII1oOoolO = (OOIII1oOoolO) oI10i0Il.getValue();
/* 118 */                   if (oOIII1oOoolO != null) {
/* 122 */                       OOIII1l oOIII1l = new OOIII1l(oOIII1oOoolO);
/* 127 */                       OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I0000Il00O;
/* 129 */                       if (oI0lOIiOIOOo != null) {
/* 131 */                           oI0lOIiOIOOo.I00000oOI(oOIII1l);
                                }
/* 134 */                       oI10i0Il.setValue(null);
                                break;
                            }
                            break;
                        case 12:
/* 104 */                   ((Oo0io0) this.I00000oOI).I0000Il00O.remove((Function1) this.I0000Il00O);
                            break;
                        case 13:
/* 90 */                    ((OoI1Oi0l1I0o) this.I00000oOI).I000iOII.remove((OoI1iOl0IoI) this.I0000Il00O);
                            break;
                        case 14:
/* 53 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) this.I00000oOI;
/* 57 */                    OoI1I1i1 ooI1I1i1 = (OoI1I1i1) this.I0000Il00O;
/* 59 */                    ooI1Oi0l1I0o.getClass();
/* 68 */                    OoI11o1OI ooI11o1OI = (OoI11o1OI) ooI1I1i1.I00000oOI.getValue();
/* 70 */                    if (ooI11o1OI != null) {
/* 76 */                        ooI1Oi0l1I0o.I000OiO.remove(ooI11o1OI.I00iOIl);
                                break;
                            }
                            break;
                        case 15:
/* 47 */                    ((OoI1Oi0l1I0o) this.I00000oOI).I000OiO.remove((OoI1O1OIoI) this.I0000Il00O);
                            break;
                        default:
/* 9 */                     i00lIlOOll0 i00lilooll0 = (i00lIlOOll0) this.I00000oOI;
/* 13 */                    View view = (View) this.I0000Il00O;
                            int i = i00lilooll0.I001IIilI0O - 1;
/* 19 */                    i00lilooll0.I001IIilI0O = i;
/* 21 */                    if (i == 0) {
/* 23 */                        WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 25 */                        OooiIOIoi.I00000oOI(view, null);
/* 28 */                        view.setWindowInsetsAnimationCallback(null);
/* 33 */                        view.removeOnAttachStateChangeListener(i00lilooll0.I001IO000);
                                break;
                            }
                            break;
                    }
                }
            }
