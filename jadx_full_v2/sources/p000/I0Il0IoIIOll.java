            package p000;

            import android.webkit.WebView;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I0Il0IoIIOll implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public I0Il0IoIIOll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 310 */                   ((Boolean) obj).getClass();
/* 328 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case 1:
/* 304 */                   oI10i0Il.setValue((Oo0OI01Il) obj);
                            break;
                        case 2:
/* 298 */                   oI10i0Il.setValue((Oo0OI01Il) obj);
                            break;
                        case 3:
/* 292 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 4:
/* 286 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 5:
/* 280 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 6:
/* 274 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 7:
/* 250 */                   ((Boolean) obj).getClass();
/* 268 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case 8:
/* 244 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 9:
/* 238 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 10:
/* 232 */                   oI10i0Il.setValue(Oo0OI01Il.I00000oIO((Oo0OI01Il) oI10i0Il.getValue(), null, lOliOi0Oi.I00000oIO(0, ((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI.length()), 5));
                            break;
                        case 11:
/* 179 */                   Boolean bool = (Boolean) obj;
/* 181 */                   bool.getClass();
/* 188 */                   Oi0O100II11O oi0O100II11O = (Oi0O100II11O) oI10i0Il.getValue();
/* 190 */                   if (oi0O100II11O != null) {
/* 194 */                       oi0O100II11O.I00000oOI.I00O10llo(bool);
/* 197 */                       oI10i0Il.setValue(null);
                                break;
                            }
                            break;
                        case 12:
/* 175 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 13:
/* 160 */                   WebView webView = (WebView) obj;
/* 162 */                   oI10i0Il.setValue(webView);
/* 169 */                   webView.addJavascriptInterface(IO0O0o0O1Ol.I00000oIO, "AiEdgeGallery");
                            break;
                        case 14:
/* 156 */                   oI10i0Il.setValue((O0iOOo0Ii) obj);
                            break;
                        case 15:
/* 145 */                   I1iIOl01I0 i1iIOl01I0 = new I1iIOl01I0(0);
/* 148 */                   i1iIOl01I0.I00000oOI = oI10i0Il;
/* 150 */                   VarHandle.storeStoreFence();
                            break;
                        case 16:
/* 132 */                   I1iIOl01I0 i1iIOl01I02 = new I1iIOl01I0(1);
/* 135 */                   i1iIOl01I02.I00000oOI = oI10i0Il;
/* 137 */                   VarHandle.storeStoreFence();
                            break;
                        case 17:
/* 119 */                   Boolean bool2 = (Boolean) obj;
/* 121 */                   bool2.getClass();
/* 124 */                   oI10i0Il.setValue(bool2);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 115 */                   oI10i0Il.setValue((O0iOOo0Ii) obj);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 105 */                   List list = (List) obj;
/* 107 */                   if (oI10i0Il != null) {
/* 109 */                       oI10i0Il.setValue(list);
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 90 */                    OloOoIO1OOo oloOoIO1OOo = (OloOoIO1OOo) obj;
/* 101 */                   oI10i0Il.setValue(oloOoIO1OOo.I0000Il00O ? oloOoIO1OOo.I00000oOI : oloOoIO1OOo.I00000oIO);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 86 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 55 */                    Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 57 */                    O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 61 */                    oil0O0I.I00000oOI(Oil0I1O.I000O01llI0, ooiIlOl1iI);
/* 80 */                    Oil0Io.I0000O(oil0O0I, ((II1l1O1oi01) oI10i0Il.getValue()).I00000oIO.I00iOIl.concat(" mode"));
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 51 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 45 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 39 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 33 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case 27:
/* 27 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 21 */                    oI10i0Il.setValue((Oo0iil0o0oI) obj);
                            break;
                        default:
/* 15 */                    oI10i0Il.setValue((String) obj);
                            break;
                    }
/* 18 */            return ooiIlOl1iI;
                }
            }
