            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 31 */    public final class OIoolIIoO00l implements Parcelable.ClassLoaderCreator {
                public final int I00000oIO;

                public OIoolIIoO00l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static OIooliIO0 I00000oIO(Parcel parcel, ClassLoader classLoader) {
                    Ol1lllIil ol1lllIil;
/* 1 */             if (classLoader == null) {
/* 5 */                 classLoader = OIoolIIoO00l.class.getClassLoader();
                    }
/* 9 */             Object value = parcel.readValue(classLoader);
/* 13 */            int i = parcel.readInt();
/* 19 */            if (i == 0) {
/* 46 */                ol1lllIil = IIIOlol.I00ilO0;
                    } else if (i == 1) {
/* 43 */                ol1lllIil = Io1Oioii1111.I00ilO0;
                    } else {
/* 25 */                if (i != 2) {
/* 38 */                    I000II.I001IO000(IIlIOloOOO.I00100l0("Unsupported MutableState policy ", i, " was restored"));
/* 41 */                    return null;
                        }
/* 27 */                ol1lllIil = IOO0o0I1l.I00ilI0I1;
                    }
/* 48 */            return new OIooliIO0(value, ol1lllIil);
                }

                @Override
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    switch (this.I00000oIO) {
                        case 0:
/* 28 */                    return I00000oIO(parcel, classLoader);
                        case 1:
/* 16 */                    if (parcel.readParcelable(classLoader) == null) {
/* 18 */                        return I00iIO.I00iiI;
                            }
/* 23 */                    I000II.I001IO000("superState must be null");
/* 26 */                    return null;
                        default:
/* 8 */                     return new Oo1i1OOOOI(parcel, classLoader);
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 12 */                    return new OIooliIO0[i];
                        case 1:
/* 9 */                     return new I00iIO[i];
                        default:
/* 6 */                     return new Oo1i1OOOOI[i];
                    }
                }

                @Override
/* 32 */        public final Object createFromParcel(Parcel parcel) {
                    switch (this.I00000oIO) {
                        case 0:
/* 37 */                    return I00000oIO(parcel, null);
                        case 1:
/* 34 */                    if (parcel.readParcelable(null) == null) {
/* 35 */                        return I00iIO.I00iiI;
                            }
/* 36 */                    I000II.I001IO000("superState must be null");
                            return null;
                        default:
/* 33 */                    return new Oo1i1OOOOI(parcel, null);
                    }
                }
            }
