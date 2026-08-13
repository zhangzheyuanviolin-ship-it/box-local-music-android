            package p000;

            import com.google.mlkit.vision.pose.Pose;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IloIil1iOi implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public OI10i0Il I00iio;
                public OI10i0Il I00ilI0I1;

                public IloIil1iOi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 45 */                    int i2 = this.I00iiI;
/* 47 */                    int i3 = this.I00iiO;
/* 49 */                    OI10i0Il oI10i0Il = this.I00iio;
/* 51 */                    OI10i0Il oI10i0Il2 = this.I00ilI0I1;
/* 53 */                    List list = (List) obj;
/* 62 */                    if (!list.isEmpty()) {
/* 68 */                        oI10i0Il.setValue(Iloo0ilo.I000OiO(list));
                            }
/* 75 */                    oI10i0Il2.setValue(Iloo0ilo.I000iOII(i2, i3, list));
                            break;
                        default:
/* 8 */                     int i4 = this.I00iiI;
/* 10 */                    int i5 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il3 = this.I00iio;
/* 14 */                    OI10i0Il oI10i0Il4 = this.I00ilI0I1;
/* 16 */                    Pose pose = (Pose) obj;
/* 28 */                    if (!pose.getAllPoseLandmarks().isEmpty()) {
/* 34 */                        oI10i0Il3.setValue(Iloo0ilo.I0010o(pose));
                            }
/* 41 */                    oI10i0Il4.setValue(Iloo0ilo.I00111O(pose, i4, i5));
                            break;
                    }
/* 44 */            return ooiIlOl1iI;
                }
            }
