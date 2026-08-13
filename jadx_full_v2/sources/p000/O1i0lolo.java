            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 7 */     public final class O1i0lolo implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public O1i0lolo(OI10i0Il oI10i0Il, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oI10i0Il;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 290 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 1:
/* 231 */                   List list = (List) obj;
/* 284 */                   oI10i0Il.setValue(list.size() + ((List) oI10i0Il.getValue()).size() <= 1 ? IOOi0Ool1i.I00O10llo((List) oI10i0Il.getValue(), list) : IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00O10llo((List) oI10i0Il.getValue(), list), 1));
                            break;
                        case 2:
/* 222 */                   Boolean bool = (Boolean) obj;
/* 224 */                   bool.booleanValue();
/* 227 */                   oI10i0Il.setValue(bool);
                            break;
                        case 3:
/* 214 */                   if (((Boolean) obj).booleanValue()) {
/* 218 */                       oI10i0Il.setValue(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 4:
/* 204 */                   ((Oi11lOiIoi) obj).I0000Il00O(((O1o0lio) oI10i0Il.getValue()).I00000oOI ? 0.5f : 1.0f);
                            break;
                        case 5:
/* 181 */                   List list2 = O1oOO0O1l0.I00000oIO;
/* 183 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 6:
/* 175 */                   oI10i0Il.setValue((O0iOOo0Ii) obj);
                            break;
                        case 7:
/* 169 */                   oI10i0Il.setValue((Oo0iil0o0oI) obj);
                            break;
                        case 8:
/* 163 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 9:
/* 157 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 10:
/* 129 */                   Float f = (Float) obj;
/* 131 */                   f.getClass();
                            break;
                        case 11:
/* 120 */                   Boolean bool2 = (Boolean) obj;
/* 122 */                   bool2.booleanValue();
/* 125 */                   oI10i0Il.setValue(bool2);
                            break;
                        case 12:
/* 111 */                   Float f2 = (Float) obj;
/* 113 */                   f2.getClass();
/* 116 */                   oI10i0Il.setValue(f2);
                            break;
                        case 13:
/* 107 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 14:
/* 101 */                   oI10i0Il.setValue((String) obj);
                            break;
                        case 15:
/* 95 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case 16:
/* 89 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case 17:
/* 78 */                    I1iIOl01I0 i1iIOl01I0 = new I1iIOl01I0(3);
/* 81 */                    i1iIOl01I0.I00000oOI = oI10i0Il;
/* 83 */                    VarHandle.storeStoreFence();
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 64 */                    I1iIOl01I0 i1iIOl01I02 = new I1iIOl01I0(4);
/* 67 */                    i1iIOl01I02.I00000oOI = oI10i0Il;
/* 69 */                    VarHandle.storeStoreFence();
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 55 */                    oI10i0Il.setValue((String) obj);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 49 */                    ((Function1) oI10i0Il.getValue()).invoke((OIOlIiiioi) obj);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 37 */                    oI10i0Il.setValue((O0iOOo0Ii) obj);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 31 */                    oI10i0Il.setValue(OIOlIiiioi.I00000oIO(((O0iOOo0Ii) obj).I001l0I00(0L)));
                            break;
                        default:
/* 10 */                    Boolean bool3 = (Boolean) obj;
/* 12 */                    bool3.booleanValue();
/* 15 */                    oI10i0Il.setValue(bool3);
                            break;
                    }
/* 18 */            return ooiIlOl1iI;
                }

/* 8 */         public O1i0lolo(int i) {
/* 9 */             this.I00iOIl = i;
                }
            }
