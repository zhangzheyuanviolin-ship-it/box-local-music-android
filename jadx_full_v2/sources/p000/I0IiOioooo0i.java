            package p000;

            import java.io.Serializable;
            
            public class I0IiOioooo0i implements Illl0OO0l, Serializable {
                public final Object I00iOIl;
                public final Class I00iiI;
                public final String I00iiO;
                public final String I00iio;
                public final boolean I00ilI0I1 = false;
                public final int I00ilO0;
                public final int I00io1l;

                public I0IiOioooo0i(int i, int i2, Class cls, Object obj, String str, String str2) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = cls;
/* 8 */             this.I00iiO = str;
/* 10 */            this.I00iio = str2;
/* 15 */            this.I00ilO0 = i;
/* 19 */            this.I00io1l = i2 >> 1;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 69 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0IiOioooo0i)) {
/* 71 */                return false;
                    }
/* 9 */             I0IiOioooo0i i0IiOioooo0i = (I0IiOioooo0i) obj;
                    return this.I00ilI0I1 == i0IiOioooo0i.I00ilI0I1 && this.I00ilO0 == i0IiOioooo0i.I00ilO0 && this.I00io1l == i0IiOioooo0i.I00io1l && O0000Ioio00.I0000O(this.I00iOIl, i0IiOioooo0i.I00iOIl) && this.I00iiI.equals(i0IiOioooo0i.I00iiI) && this.I00iiO.equals(i0IiOioooo0i.I00iiO) && this.I00iio.equals(i0IiOioooo0i.I00iio);
                }

                @Override
                public final int getArity() {
/* 1 */             return this.I00ilO0;
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00iOIl;
/* 51 */            return ((((Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((this.I00iiI.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.I00iiO), 31, this.I00iio) + (this.I00ilI0I1 ? 1231 : 1237)) * 31) + this.I00ilO0) * 31) + this.I00io1l;
                }

                public final String toString() {
/* 3 */             return OOoOl0i.I00000oIO.I000OiO(this);
                }
            }
