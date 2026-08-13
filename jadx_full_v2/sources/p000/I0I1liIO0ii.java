            package p000;

            import android.view.MenuInflater;
            import android.view.View;
            
/* 10 */    public abstract class I0I1liIO0ii {
                public final int I00iOIl = 0;
                public boolean I00iiI;
                public Object I00iiO;

                public I0I1liIO0ii(String str, boolean z) {
/* 7 */             this.I00iiO = str;
/* 9 */             this.I00iiI = z;
                }

                public Integer I00000oIO(I0I1liIO0ii i0I1liIO0ii) {
/* 1 */             O1OOII o1ooii = OoooIi1i0i.I00000oIO;
/* 3 */             if (this == i0I1liIO0ii) {
/* 6 */                 return 0;
                    }
/* 11 */            O1OOII o1ooii2 = OoooIi1i0i.I00000oIO;
/* 17 */            Integer num = (Integer) o1ooii2.get(this);
/* 23 */            Integer num2 = (Integer) o1ooii2.get(i0I1liIO0ii);
/* 25 */            if (num == null || num2 == null || num.equals(num2)) {
/* 50 */                return null;
                    }
/* 45 */            return Integer.valueOf(num.intValue() - num2.intValue());
                }

                public abstract void I00000oOI();

                public abstract View I0000Il00O();

                public String I0000oI00() {
/* 3 */             return (String) this.I00iiO;
                }

                public abstract O1illlIiilIl I0001Ioi1lo();

                public abstract MenuInflater I000II();

                public abstract CharSequence I000O01llI0();

                public abstract CharSequence I000OOo1O();

                public abstract void I000OiO();

                public abstract boolean I000iOII();

                public abstract void I000lI(View view);

                public abstract void I000o00OoI0I(int i);

                public abstract void I000oI1ioi(CharSequence charSequence);

                public abstract void I00100l0(int i);

                public abstract void I00100o1O0lo(CharSequence charSequence);

                public abstract void I0010I0i(boolean z);

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 11 */                    return I0000oI00();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 11 */        public I0I1liIO0ii() {
                }

/* 19 */        public I0I1liIO0ii I000l1() {
/* 20 */            return this;
                }
            }
