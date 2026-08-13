            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.os.Parcel;
            import android.text.TextUtils;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Objects;
            
/* 7 */     public final class I0i0io0oOOi implements IiooiiI01Olo, OOooilOIIl0I, i1olliOl {
                public static final I0i0io0oOOi I00iiO;
                public static final I0i0io0oOOi I00iio;
                public static final I0i0io0oOOi I00ilI0I1;
                public static final I0i0io0oOOi I00ilO0;
                public static final I0i0io0oOOi I00io1l;
                public static final I0i0io0oOOi I00ioIO;
                public static final I0i0io0oOOi I00l0I0l0lO1;
                public static final I0i0io0oOOi I00l0OO0IO;
                public final int I00iOIl;
                public String I00iiI;

                static {
/* 5 */             int i = 0;
/* 9 */             I00iiO = new I0i0io0oOOi("TINK", i);
/* 18 */            I00iio = new I0i0io0oOOi("CRUNCHY", i);
/* 27 */            I00ilI0I1 = new I0i0io0oOOi("NO_PREFIX", i);
/* 33 */            int i2 = 1;
/* 37 */            I00ilO0 = new I0i0io0oOOi("SHA1", i2);
/* 46 */            I00io1l = new I0i0io0oOOi("SHA224", i2);
/* 55 */            I00ioIO = new I0i0io0oOOi("SHA256", i2);
/* 64 */            I00l0I0l0lO1 = new I0i0io0oOOi("SHA384", i2);
/* 73 */            I00l0OO0IO = new I0i0io0oOOi("SHA512", i2);
                }

                public I0i0io0oOOi(String str, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
                }

                @Override
                public Iterator I00000oIO(I0oO0iO1l0lo i0oO0iO1l0lo, String str) {
/* 4 */             return new o0Iil1O(this, i0oO0iO1l0lo, str, 1);
                }

                public void I00000oOI(StringBuilder sb, Iterator it) {
                    try {
/* 5 */                 if (it.hasNext()) {
/* 7 */                     Object next = it.next();
/* 11 */                    Objects.requireNonNull(next);
/* 25 */                    sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
/* 32 */                    while (it.hasNext()) {
/* 36 */                        sb.append((CharSequence) this.I00iiI);
/* 39 */                        Object next2 = it.next();
/* 43 */                        Objects.requireNonNull(next2);
/* 57 */                        sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                            }
                        }
                    } catch (IOException e) {
/* 63 */                I000II.I000O01llI0(e);
                    }
                }

                public IOllii I0000Il00O() {
/* 3 */             IOllii iOllii = new IOllii();
/* 11 */            iOllii.I00000oIO = iio0IIOOIOI.I00000oIO(false);
/* 15 */            iOllii.I00000oOI = IiiIil1lOIO.I00000oIO;
/* 22 */            iOllii.I0000Il00O = iio0IIOOIOI.I00000oIO(true);
/* 31 */            iOllii.I0000O = new o0llIi(15);
/* 35 */            iOllii.I0000oI00 = IiIO11ioI.I00000oIO;
/* 39 */            iOllii.I0001Ioi1lo = O1oO0lOoI1.I00ilI0I1;
/* 43 */            Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 54 */            oi00IilOloo0.I00iOIl = Handler.createAsync(Looper.getMainLooper());
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            iOllii.I000II = oi00IilOloo0;
/* 62 */            iOllii.I000OiO = 4;
/* 67 */            iOllii.I000iOII = Integer.MAX_VALUE;
/* 71 */            iOllii.I000lI = 20;
/* 75 */            iOllii.I000O01llI0 = this.I00iiI;
/* 80 */            iOllii.I000OOo1O = 600000L;
/* 84 */            iOllii.I000l1 = 8;
/* 86 */            iOllii.I000o00OoI0I = true;
/* 95 */            iOllii.I000oI1ioi = new O1oO0lOoI1(10);
/* 97 */            VarHandle.storeStoreFence();
/* 110 */           return iOllii;
                }

                @Override
                public boolean I000o00OoI0I(CharSequence charSequence, int i, int i2, OoOl1ol1l ooOl1ol1l) {
/* 11 */            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.I00iiI)) {
/* 23 */                return true;
                    }
/* 19 */            ooOl1ol1l.I0000Il00O = (ooOl1ol1l.I0000Il00O & 3) | 4;
/* 21 */            return false;
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 5 */             int i = lI1i1OI1O0l.I000iOII;
/* 9 */             l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((OloIlI0ll) obj2);
/* 16 */            lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 18 */            String str = this.I00iiI;
/* 20 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 24 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 27 */            parcelI00Iooi00oi.writeString(str);
/* 31 */            liil1lol0ioi.I00O0o1oo(5, parcelI00Iooi00oi);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    return this.I00iiI;
                        case 1:
/* 11 */                    return this.I00iiI;
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 8 */         public I0i0io0oOOi(int i) {
/* 9 */             this.I00iOIl = i;
                }

                @Override
/* 19 */        public Object I000l1() {
/* 20 */            return this;
                }
            }
