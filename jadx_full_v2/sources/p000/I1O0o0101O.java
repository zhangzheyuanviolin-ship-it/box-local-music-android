            package p000;

            import android.graphics.RectF;
            import android.util.Rational;
            import java.util.Arrays;
            import java.util.Comparator;
            
/* 24 */    public final class I1O0o0101O implements Comparator {
                public final int I00iOIl = 1;
                public Object I00iiI;
                public Object I00iiO;

                public I1O0o0101O(Rational rational, Rational rational2) {
/* 17 */            this.I00iiO = rational2 == null ? new Rational(4, 3) : rational2;
/* 23 */            this.I00iiI = I00000oOI(rational);
                }

                public static float I00000oIO(RectF rectF, RectF rectF2) {
/* 43 */            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
                }

                public RectF I00000oOI(Rational rational) {
/* 1 */             float fFloatValue = rational.floatValue();
/* 7 */             Rational rational2 = (Rational) this.I00iiO;
                    return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
                }

                @Override
                public final int compare(Object obj, Object obj2) {
/* 4 */             boolean z = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 82 */                    Rational rational = (Rational) obj;
/* 84 */                    Rational rational2 = (Rational) obj2;
/* 88 */                    RectF rectF = (RectF) this.I00iiI;
/* 94 */                    if (rational.equals(rational2)) {
/* 4 */                         return 0;
                            }
/* 99 */                    RectF rectFI00000oOI = I00000oOI(rational);
/* 103 */                   RectF rectFI00000oOI2 = I00000oOI(rational2);
/* 133 */                   boolean z2 = rectFI00000oOI.width() >= rectF.width() && rectFI00000oOI.height() >= rectF.height();
/* 144 */                   if (rectFI00000oOI2.width() >= rectF.width() && rectFI00000oOI2.height() >= rectF.height()) {
/* 158 */                       z = true;
                            }
/* 159 */                   if (z2 && z) {
/* 186 */                       return (int) Math.signum((rectFI00000oOI.height() * rectFI00000oOI.width()) - (rectFI00000oOI2.height() * rectFI00000oOI2.width()));
                            }
/* 188 */                   if (z2) {
/* 3 */                         return -1;
                            }
/* 191 */                   if (z) {
/* 5 */                         return 1;
                            }
/* 209 */                   return -((int) Math.signum(I00000oIO(rectFI00000oOI, rectF) - I00000oIO(rectFI00000oOI2, rectF)));
                        default:
/* 9 */                     iO0iIIoO11 io0iiioo11 = (iO0iIIoO11) obj;
/* 13 */                    iO0iIIoO11 io0iiioo112 = (iO0iIIoO11) obj2;
/* 15 */                    if (io0iiioo11 instanceof iOOl1i1) {
                                return !(io0iiioo112 instanceof iOOl1i1) ? 1 : 0;
                            }
/* 27 */                    if (io0iiioo112 instanceof iOOl1i1) {
/* 3 */                         return -1;
                            }
/* 32 */                    iIIoIiOoOoiO iiioiiooooio = (iIIoIiOoOoiO) this.I00iiI;
                            return iiioiiooooio == null ? io0iiioo11.zzc().compareTo(io0iiioo112.zzc()) : (int) ll00I0ii.I000O01llI0(iiioiiooooio.I00000oIO((OillOo0) this.I00iiO, Arrays.asList(io0iiioo11, io0iiioo112)).zzd().doubleValue());
                    }
                }

/* 25 */        public I1O0o0101O() {
                }
            }
