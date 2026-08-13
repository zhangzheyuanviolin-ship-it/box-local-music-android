            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.List;
            
            public abstract class lO0IioIooIl {
                public static void I00000oIO(Parcel parcel, int i, Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeBundle(bundle);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I00000oOI(Parcel parcel, int i, byte[] bArr) {
/* 1 */             if (bArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeByteArray(bArr);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I0000Il00O(Parcel parcel, int i, byte[][] bArr) {
/* 1 */             if (bArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 9 */             parcel.writeInt(bArr.length);
/* 13 */            for (byte[] bArr2 : bArr) {
/* 17 */                parcel.writeByteArray(bArr2);
                    }
/* 23 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I0000O(Parcel parcel, int i, Double d) {
/* 1 */             if (d == null) {
/* 3 */                 return;
                    }
/* 6 */             I000oI1ioi(parcel, i, 8);
/* 13 */            parcel.writeDouble(d.doubleValue());
                }

                public static void I0000oI00(Parcel parcel, int i, float[] fArr) {
/* 1 */             if (fArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeFloatArray(fArr);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I0001Ioi1lo(Parcel parcel, int i, IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeStrongBinder(iBinder);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000II(Parcel parcel, int i, int[] iArr) {
/* 1 */             if (iArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeIntArray(iArr);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000O01llI0(Parcel parcel, int i, Long l) {
/* 1 */             if (l == null) {
/* 3 */                 return;
                    }
/* 6 */             I000oI1ioi(parcel, i, 8);
/* 13 */            parcel.writeLong(l.longValue());
                }

                public static void I000OOo1O(Parcel parcel, int i, Parcelable parcelable, int i2) {
/* 1 */             if (parcelable == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcelable.writeToParcel(parcel, i2);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000OiO(Parcel parcel, int i, String str) {
/* 1 */             if (str == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeString(str);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000iOII(Parcel parcel, int i, String[] strArr) {
/* 1 */             if (strArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeStringArray(strArr);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000l1(Parcel parcel, int i, List list) {
/* 1 */             if (list == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             parcel.writeStringList(list);
/* 11 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000lI(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
/* 1 */             if (parcelableArr == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 9 */             parcel.writeInt(parcelableArr.length);
/* 14 */            for (Parcelable parcelable : parcelableArr) {
/* 18 */                if (parcelable == null) {
/* 20 */                    parcel.writeInt(0);
                        } else {
/* 24 */                    int iDataPosition = parcel.dataPosition();
/* 29 */                    parcel.writeInt(1);
/* 32 */                    int iDataPosition2 = parcel.dataPosition();
/* 36 */                    parcelable.writeToParcel(parcel, i2);
/* 39 */                    int iDataPosition3 = parcel.dataPosition();
/* 43 */                    parcel.setDataPosition(iDataPosition);
/* 48 */                    parcel.writeInt(iDataPosition3 - iDataPosition2);
/* 51 */                    parcel.setDataPosition(iDataPosition3);
                        }
                    }
/* 57 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000o00OoI0I(Parcel parcel, int i, List list) {
/* 1 */             if (list == null) {
/* 3 */                 return;
                    }
/* 4 */             int iI00100l0 = I00100l0(i, parcel);
/* 8 */             int size = list.size();
/* 12 */            parcel.writeInt(size);
/* 17 */            for (int i2 = 0; i2 < size; i2++) {
/* 23 */                Parcelable parcelable = (Parcelable) list.get(i2);
/* 25 */                if (parcelable == null) {
/* 27 */                    parcel.writeInt(0);
                        } else {
/* 31 */                    int iDataPosition = parcel.dataPosition();
/* 36 */                    parcel.writeInt(1);
/* 39 */                    int iDataPosition2 = parcel.dataPosition();
/* 43 */                    parcelable.writeToParcel(parcel, 0);
/* 46 */                    int iDataPosition3 = parcel.dataPosition();
/* 50 */                    parcel.setDataPosition(iDataPosition);
/* 55 */                    parcel.writeInt(iDataPosition3 - iDataPosition2);
/* 58 */                    parcel.setDataPosition(iDataPosition3);
                        }
                    }
/* 64 */            I00100o1O0lo(iI00100l0, parcel);
                }

                public static void I000oI1ioi(Parcel parcel, int i, int i2) {
/* 4 */             parcel.writeInt(i | (i2 << 16));
                }

                public static int I00100l0(int i, Parcel parcel) {
/* 4 */             parcel.writeInt(i | (-65536));
/* 8 */             parcel.writeInt(0);
/* 11 */            return parcel.dataPosition();
                }

                public static void I00100o1O0lo(int i, Parcel parcel) {
/* 1 */             int iDataPosition = parcel.dataPosition();
/* 9 */             parcel.setDataPosition(i - 4);
/* 12 */            parcel.writeInt(iDataPosition - i);
/* 15 */            parcel.setDataPosition(iDataPosition);
                }
            }
