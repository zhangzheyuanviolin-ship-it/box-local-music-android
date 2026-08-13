            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li0I0I1I011I;", "LO1oooooIio;", "Li0I0IiO0I1;", "animation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class i0I0I1I011I extends O1oooooIio {
                public float I00000oIO;
                public Object I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             float f = this.I00000oIO;
/* 5 */             Object obj = this.I00000oOI;
/* 7 */             i0I0IiO0I1 i0i0iio0i1 = new i0I0IiO0I1();
/* 10 */            i0i0iio0i1.I00o0iI0io1 = f;
/* 12 */            i0i0iio0i1.I00o0l1o1o0 = obj;
/* 20 */            return i0i0iio0i1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             i0I0IiO0I1 i0i0iio0i1 = (i0I0IiO0I1) o1ooOo;
/* 5 */             i0i0iio0i1.I00o0iI0io1 = this.I00000oIO;
/* 9 */             i0i0iio0i1.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof i0I0I1I011I)) {
/* 27 */                return false;
                    }
/* 5 */             i0I0I1I011I i0i0i1i011i = (i0I0I1I011I) obj;
                    return i0i0i1i011i.I00000oIO == this.I00000oIO && O0000Ioio00.I0000O(i0i0i1i011i.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Float.hashCode(this.I00000oIO) * 31;
/* 9 */             Object obj = this.I00000oOI;
/* 19 */            return iHashCode + (obj != null ? obj.hashCode() : 0);
                }
            }
