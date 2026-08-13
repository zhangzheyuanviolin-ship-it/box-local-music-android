            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.stream.Collectors;
            import java.util.stream.Stream;
            
            public final class il1iolOIi1O1 extends I01OlIoIl {
                public static final Parcelable.Creator<il1iolOIi1O1> CREATOR = new iiiilIIoIi(21);
                public String I00iOIl;
                public String I00iiI;
                public iiooOolI1 I00iiO;
                public iiooOolI1 I00iio;

                public final String toString() {
/* 29 */            return (String) Stream.of((Object[]) new String[]{this.I00iOIl, this.I00iiI}).filter(il1iO10iO.I00000oOI).collect(Collectors.joining(","));
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             String str = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, str);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 28 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iio, i);
/* 31 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
