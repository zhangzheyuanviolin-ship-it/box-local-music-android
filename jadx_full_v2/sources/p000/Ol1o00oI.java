            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 17 */    public final class Ol1o00oI implements Parcelable.ClassLoaderCreator {
                public final int I00000oIO;

                public static Ol1o0O0O0 I00000oIO(Parcel parcel, ClassLoader classLoader) {
/* 1 */             if (classLoader == null) {
/* 5 */                 classLoader = Ol1o00oI.class.getClassLoader();
                    }
/* 9 */             int i = parcel.readInt();
/* 13 */            if (i == 0) {
/* 17 */                return new Ol1o0O0O0();
                    }
/* 23 */            OO100II1 oo100ii1I000iOII = Ol1Iil.I00iiI.I000iOII();
/* 28 */            for (int i2 = 0; i2 < i; i2++) {
/* 34 */                oo100ii1I000iOII.add(parcel.readValue(classLoader));
                    }
/* 46 */            return new Ol1o0O0O0(oo100ii1I000iOII.I000OOo1O());
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
                    switch (this.I00000oIO) {
                        case 0:
/* 13 */                    return I00000oIO(parcel, null);
                        default:
/* 9 */                     return new O1Olilo0i1(parcel, null);
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     return new Ol1o0O0O0[i];
                        default:
/* 6 */                     return new O1Olilo0i1[i];
                    }
                }

                @Override
/* 18 */        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    switch (this.I00000oIO) {
                        case 0:
/* 20 */                    return I00000oIO(parcel, classLoader);
                        default:
/* 19 */                    return new O1Olilo0i1(parcel, classLoader);
                    }
                }
            }
