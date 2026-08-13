            package p000;

            import android.view.View;
            
            public final class Iio1o0Ol extends ilOiiolOolll {
                public final int I00000oIO;

                public Iio1o0Ol(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final float I00000oIO(O1Ooi0 o1Ooi0) {
                    switch (this.I00000oIO) {
                        case 0:
/* 43 */                    return ((View) o1Ooi0).getAlpha();
                        case 1:
/* 36 */                    return ((View) o1Ooi0).getScaleX();
                        case 2:
/* 29 */                    return ((View) o1Ooi0).getScaleY();
                        case 3:
/* 22 */                    return ((View) o1Ooi0).getRotation();
                        case 4:
/* 15 */                    return ((View) o1Ooi0).getRotationX();
                        default:
/* 8 */                     return ((View) o1Ooi0).getRotationY();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I00000oOI(O1Ooi0 o1Ooi0, float f) {
                    switch (this.I00000oIO) {
                        case 0:
/* 38 */                    ((View) o1Ooi0).setAlpha(f);
                            break;
                        case 1:
/* 32 */                    ((View) o1Ooi0).setScaleX(f);
                            break;
                        case 2:
/* 26 */                    ((View) o1Ooi0).setScaleY(f);
                            break;
                        case 3:
/* 20 */                    ((View) o1Ooi0).setRotation(f);
                            break;
                        case 4:
/* 14 */                    ((View) o1Ooi0).setRotationX(f);
                            break;
                        default:
/* 8 */                     ((View) o1Ooi0).setRotationY(f);
                            break;
                    }
                }
            }
