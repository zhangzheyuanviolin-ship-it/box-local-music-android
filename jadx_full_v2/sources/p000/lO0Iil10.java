            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            public abstract class lO0Iil10 {
                public static Bundle I00000oIO(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            Bundle bundle = parcel.readBundle();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return bundle;
                }

                public static byte[] I00000oOI(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            byte[] bArrCreateByteArray = parcel.createByteArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return bArrCreateByteArray;
                }

                public static byte[][] I0000Il00O(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            int i2 = parcel.readInt();
/* 17 */            byte[][] bArr = new byte[i2][];
/* 20 */            for (int i3 = 0; i3 < i2; i3++) {
/* 26 */                bArr[i3] = parcel.createByteArray();
                    }
/* 32 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return bArr;
                }

                public static float[] I0000O(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            float[] fArrCreateFloatArray = parcel.createFloatArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return fArrCreateFloatArray;
                }

                public static int[] I0000oI00(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            int[] iArrCreateIntArray = parcel.createIntArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return iArrCreateIntArray;
                }

                public static Parcelable I0001Ioi1lo(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 17 */            Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
/* 20 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 98 */            return parcelable;
                }

                public static String I000II(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            String string = parcel.readString();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return string;
                }

                public static String[] I000O01llI0(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            String[] strArrCreateStringArray = parcel.createStringArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return strArrCreateStringArray;
                }

                public static ArrayList I000OOo1O(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return arrayListCreateStringArrayList;
                }

                public static Object[] I000OiO(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 98 */            return objArrCreateTypedArray;
                }

                public static ArrayList I000iOII(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 98 */            return arrayListCreateTypedArrayList;
                }

                public static void I000l1(int i, Parcel parcel) {
/* 5 */             if (parcel.dataPosition() != i) {
/* 37 */                throw new OiIi1iiiil01(Oi010OO0.I00100l0(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
                    }
                }

                public static boolean I000lI(int i, Parcel parcel) {
/* 2 */             I001i1lo1io(parcel, i, 4);
                    return parcel.readInt() != 0;
                }

                public static double I000o00OoI0I(int i, Parcel parcel) {
/* 3 */             I001i1lo1io(parcel, i, 8);
/* 6 */             return parcel.readDouble();
                }

                public static Double I000oI1ioi(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             if (iI001IIilI0O == 0) {
/* 7 */                 return null;
                    }
/* 11 */            I001iOo1i0O(parcel, iI001IIilI0O, 8);
/* 18 */            return Double.valueOf(parcel.readDouble());
                }

                public static float I00100l0(int i, Parcel parcel) {
/* 2 */             I001i1lo1io(parcel, i, 4);
/* 5 */             return parcel.readFloat();
                }

                public static IBinder I00100o1O0lo(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iI001IIilI0O == 0) {
/* 11 */                return null;
                    }
/* 13 */            IBinder strongBinder = parcel.readStrongBinder();
/* 18 */            parcel.setDataPosition(iDataPosition + iI001IIilI0O);
/* 37 */            return strongBinder;
                }

                public static int I0010I0i(int i, Parcel parcel) {
/* 2 */             I001i1lo1io(parcel, i, 4);
/* 5 */             return parcel.readInt();
                }

                public static long I0010o(int i, Parcel parcel) {
/* 3 */             I001i1lo1io(parcel, i, 8);
/* 6 */             return parcel.readLong();
                }

                public static Long I00111O(int i, Parcel parcel) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             if (iI001IIilI0O == 0) {
/* 7 */                 return null;
                    }
/* 11 */            I001iOo1i0O(parcel, iI001IIilI0O, 8);
/* 18 */            return Long.valueOf(parcel.readLong());
                }

                public static int I001IIilI0O(int i, Parcel parcel) {
                    return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
                }

                public static void I001IO000(int i, Parcel parcel) {
/* 10 */            parcel.setDataPosition(parcel.dataPosition() + I001IIilI0O(i, parcel));
                }

                public static int I001i1O0Ol(Parcel parcel) {
/* 1 */             int i = parcel.readInt();
/* 5 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 9 */             char c = (char) i;
/* 10 */            int iDataPosition = parcel.dataPosition();
/* 16 */            if (c != 20293) {
/* 168 */               throw new OiIi1iiiil01("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
                    }
/* 18 */            int i2 = iI001IIilI0O + iDataPosition;
/* 19 */            if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
/* 27 */                return i2;
                    }
/* 51 */            StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
/* 56 */            sb.append("Size read is invalid start=");
/* 59 */            sb.append(iDataPosition);
/* 64 */            sb.append(" end=");
/* 67 */            sb.append(i2);
/* 77 */            throw new OiIi1iiiil01(sb.toString(), parcel);
                }

                public static void I001i1lo1io(Parcel parcel, int i, int i2) {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i, parcel);
/* 5 */             if (iI001IIilI0O == i2) {
/* 7 */                 return;
                    }
/* 10 */            String hexString = Integer.toHexString(iI001IIilI0O);
/* 18 */            int length = String.valueOf(i2).length();
/* 48 */            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iI001IIilI0O).length() + 4 + 1);
/* 55 */            IIlIOloOOO.I001l0I00(sb, "Expected size ", i2, " got ", iI001IIilI0O);
/* 98 */            throw new OiIi1iiiil01(IIlIOloOOO.I0010I0i(sb, " (0x", hexString, ")"), parcel);
                }

                public static void I001iOo1i0O(Parcel parcel, int i, int i2) {
/* 1 */             if (i == i2) {
/* 3 */                 return;
                    }
/* 6 */             String hexString = Integer.toHexString(i);
/* 14 */            int length = String.valueOf(i2).length();
/* 44 */            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
/* 51 */            IIlIOloOOO.I001l0I00(sb, "Expected size ", i2, " got ", i);
/* 98 */            throw new OiIi1iiiil01(IIlIOloOOO.I0010I0i(sb, " (0x", hexString, ")"), parcel);
                }
            }
