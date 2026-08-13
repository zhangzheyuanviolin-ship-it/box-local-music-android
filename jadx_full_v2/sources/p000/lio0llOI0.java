            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 69 */    public final class lio0llOI0 extends I01OlIoIl {
                public static final Parcelable.Creator<lio0llOI0> CREATOR = new iolIll1o(27);
                public int I00iOIl;
                public String I00iiI;
                public long I00iiO;
                public Long I00iio;
                public String I00ilI0I1;
                public String I00ilO0;
                public Double I00io1l;

                public lio0llOI0(long j, Object obj, String str, String str2) {
/* 4 */             lII0I0I000I.I0000O(str);
/* 8 */             this.I00iOIl = 2;
/* 10 */            this.I00iiI = str;
/* 12 */            this.I00iiO = j;
/* 14 */            this.I00ilO0 = str2;
/* 17 */            if (obj == null) {
/* 19 */                this.I00iio = null;
/* 21 */                this.I00io1l = null;
/* 23 */                this.I00ilI0I1 = null;
/* 25 */                return;
                    }
/* 28 */            if (obj instanceof Long) {
/* 32 */                this.I00iio = (Long) obj;
/* 34 */                this.I00io1l = null;
/* 36 */                this.I00ilI0I1 = null;
                    } else if (obj instanceof String) {
/* 43 */                this.I00iio = null;
/* 45 */                this.I00io1l = null;
/* 49 */                this.I00ilI0I1 = (String) obj;
                    } else {
/* 54 */                if (!(obj instanceof Double)) {
/* 67 */                    I000II.I000iOII("User attribute given of un-supported type");
/* 204 */                   throw null;
                        }
/* 56 */                this.I00iio = null;
/* 60 */                this.I00io1l = (Double) obj;
/* 62 */                this.I00ilI0I1 = null;
                    }
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             iolIll1o.I00000oOI(this, parcel);
                }

                public final Object zza() {
/* 1 */             Long l = this.I00iio;
/* 3 */             if (l != null) {
/* 5 */                 return l;
                    }
/* 6 */             Double d = this.I00io1l;
/* 8 */             if (d != null) {
/* 10 */                return d;
                    }
/* 11 */            String str = this.I00ilI0I1;
/* 13 */            if (str != null) {
/* 15 */                return str;
                    }
/* 16 */            return null;
                }

/* 70 */        public lio0llOI0(lioOO0ioOI liooo0iooi) {
/* 71 */            this(liooo0iooi.I0000O, liooo0iooi.I0000oI00, liooo0iooi.I0000Il00O, liooo0iooi.I00000oOI);
                }
            }
