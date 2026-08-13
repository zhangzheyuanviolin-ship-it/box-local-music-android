            package p000;

            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
/* 7 */     public final class O0loollioliO implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public O0loollioliO(OI10i0Il oI10i0Il, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oI10i0Il;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 233 */                   Function1 function1 = (Function1) oI10i0Il.getValue();
/* 235 */                   O0lolo o0lolo = new O0lolo();
/* 245 */                   o0lolo.I00000oIO = new I00Ol00((char) 0, 8);
/* 247 */                   function1.invoke(o0lolo);
/* 250 */                   VarHandle.storeStoreFence();
                            break;
                        case 1:
/* 223 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 2:
/* 217 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 3:
/* 211 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 4:
/* 205 */                   oI10i0Il.setValue("");
                            break;
                        case 5:
/* 201 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 6:
/* 168 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 172 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 174 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 178 */                       Bundle bundle = new Bundle();
/* 185 */                       bundle.putString("action", "open_add_server");
/* 190 */                       firebaseAnalyticsI00000oIO.I00000oIO("mcp_management", bundle);
                            }
/* 195 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 7:
/* 164 */                   oI10i0Il.setValue("");
                            break;
                        case 8:
/* 160 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 9:
/* 154 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 10:
/* 148 */                   oI10i0Il.setValue(null);
                            break;
                        case 11:
/* 144 */                   oI10i0Il.setValue(null);
                            break;
                        case 12:
/* 140 */                   oI10i0Il.setValue(null);
                            break;
                        case 13:
/* 136 */                   oI10i0Il.setValue(null);
                            break;
                        case 14:
/* 132 */                   oI10i0Il.setValue(null);
                            break;
                        case 15:
/* 128 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case 16:
/* 109 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 17:
/* 103 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 97 */                    oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 78 */                    oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 72 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 66 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 60 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 54 */                    l1O0o1.I0000Il00O(oI10i0Il, true);
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 50 */                    l1O0o1.I0000Il00O(oI10i0Il, false);
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 46 */                    oI10i0Il.setValue(null);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
                            break;
                        case 27:
/* 29 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 23 */                    oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        default:
/* 17 */                    oI10i0Il.setValue(Boolean.FALSE);
                            break;
                    }
/* 20 */            return ooiIlOl1iI;
                }

/* 8 */         public O0loollioliO(int i) {
/* 9 */             this.I00iOIl = i;
                }
            }
