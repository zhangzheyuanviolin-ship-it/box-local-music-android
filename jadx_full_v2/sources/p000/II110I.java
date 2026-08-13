            package p000;

            import android.os.Bundle;
            import java.util.Arrays;
            
            public final class II110I extends OII0I1ii {
                public final int I000l1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II110I(boolean z, int i) {
/* 3 */             super(z);
/* 1 */             this.I000l1 = i;
                }

                @Override
                public final Object I00000oIO(String str, Bundle bundle) {
                    switch (this.I000l1) {
                        case 0:
/* 115 */                   if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 124 */                   boolean[] booleanArray = bundle.getBooleanArray(str);
/* 128 */                   if (booleanArray != null) {
/* 130 */                       return booleanArray;
                            }
/* 132 */                   lO0iIII0.I00000oIO(str);
/* 135 */                   throw null;
                        case 1:
/* 89 */                    if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 98 */                    float[] floatArray = bundle.getFloatArray(str);
/* 102 */                   if (floatArray != null) {
/* 104 */                       return floatArray;
                            }
/* 106 */                   lO0iIII0.I00000oIO(str);
/* 109 */                   throw null;
                        case 2:
/* 63 */                    if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 72 */                    int[] intArray = bundle.getIntArray(str);
/* 76 */                    if (intArray != null) {
/* 78 */                        return intArray;
                            }
/* 80 */                    lO0iIII0.I00000oIO(str);
/* 83 */                    throw null;
                        case 3:
/* 37 */                    if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 46 */                    long[] longArray = bundle.getLongArray(str);
/* 50 */                    if (longArray != null) {
/* 52 */                        return longArray;
                            }
/* 54 */                    lO0iIII0.I00000oIO(str);
/* 57 */                    throw null;
                        default:
/* 11 */                    if (!bundle.containsKey(str) || lO0i1o0ii.I00000oOI(str, bundle)) {
/* 3 */                         return null;
                            }
/* 20 */                    String[] stringArray = bundle.getStringArray(str);
/* 24 */                    if (stringArray != null) {
/* 26 */                        return stringArray;
                            }
/* 28 */                    lO0iIII0.I00000oIO(str);
/* 31 */                    throw null;
                    }
                }

                @Override
                public final String I00000oOI() {
                    switch (this.I000l1) {
                        case 0:
/* 18 */                    return "boolean[]";
                        case 1:
/* 15 */                    return "float[]";
                        case 2:
/* 12 */                    return "integer[]";
                        case 3:
/* 9 */                     return "long[]";
                        default:
/* 6 */                     return "string[]";
                    }
                }

                @Override
                public final Object I0000Il00O(String str) {
                    switch (this.I000l1) {
                        case 0:
/* 76 */                    return new boolean[]{((Boolean) OII0I1ii.I000O01llI0.I0000Il00O(str)).booleanValue()};
                        case 1:
/* 59 */                    return new float[]{((Number) OII0I1ii.I0001Ioi1lo.I0000Il00O(str)).floatValue()};
                        case 2:
/* 42 */                    return new int[]{((Number) OII0I1ii.I00000oOI.I0000Il00O(str)).intValue()};
                        case 3:
/* 25 */                    return new long[]{((Number) OII0I1ii.I0000O.I0000Il00O(str)).longValue()};
                        default:
/* 8 */                     return new String[]{str};
                    }
                }

                @Override
                public final Object I0000O(String str, Object obj) {
                    switch (this.I000l1) {
                        case 0:
/* 173 */                   boolean[] zArr = (boolean[]) obj;
/* 175 */                   II111ioOoi iI111ioOoi = OII0I1ii.I000O01llI0;
/* 177 */                   if (zArr == null) {
/* 214 */                       return new boolean[]{((Boolean) iI111ioOoi.I0000Il00O(str)).booleanValue()};
                            }
/* 189 */                   boolean[] zArr2 = {((Boolean) iI111ioOoi.I0000Il00O(str)).booleanValue()};
/* 193 */                   int length = zArr.length;
/* 196 */                   boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
/* 200 */                   System.arraycopy(zArr2, 0, zArrCopyOf, length, 1);
/* 218 */                   return zArrCopyOf;
                        case 1:
/* 127 */                   float[] fArr = (float[]) obj;
/* 129 */                   II111ioOoi iI111ioOoi2 = OII0I1ii.I0001Ioi1lo;
/* 131 */                   if (fArr == null) {
/* 168 */                       return new float[]{((Number) iI111ioOoi2.I0000Il00O(str)).floatValue()};
                            }
/* 143 */                   float[] fArr2 = {((Number) iI111ioOoi2.I0000Il00O(str)).floatValue()};
/* 147 */                   int length2 = fArr.length;
/* 150 */                   float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
/* 154 */                   System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
/* 172 */                   return fArrCopyOf;
                        case 2:
/* 81 */                    int[] iArr = (int[]) obj;
/* 83 */                    II111ioOoi iI111ioOoi3 = OII0I1ii.I00000oOI;
/* 85 */                    if (iArr == null) {
/* 122 */                       return new int[]{((Number) iI111ioOoi3.I0000Il00O(str)).intValue()};
                            }
/* 97 */                    int[] iArr2 = {((Number) iI111ioOoi3.I0000Il00O(str)).intValue()};
/* 101 */                   int length3 = iArr.length;
/* 104 */                   int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
/* 108 */                   System.arraycopy(iArr2, 0, iArrCopyOf, length3, 1);
/* 126 */                   return iArrCopyOf;
                        case 3:
/* 34 */                    long[] jArr = (long[]) obj;
/* 36 */                    II111ioOoi iI111ioOoi4 = OII0I1ii.I0000O;
/* 38 */                    if (jArr == null) {
/* 75 */                        return new long[]{((Number) iI111ioOoi4.I0000Il00O(str)).longValue()};
                            }
/* 50 */                    long[] jArr2 = {((Number) iI111ioOoi4.I0000Il00O(str)).longValue()};
/* 54 */                    int length4 = jArr.length;
/* 57 */                    long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
/* 61 */                    System.arraycopy(jArr2, 0, jArrCopyOf, length4, 1);
/* 80 */                    return jArrCopyOf;
                        default:
/* 8 */                     String[] strArr = (String[]) obj;
/* 10 */                    if (strArr == null) {
/* 29 */                        return new String[]{str};
                            }
/* 12 */                    String[] strArr2 = {str};
/* 16 */                    int length5 = strArr.length;
/* 19 */                    Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
/* 23 */                    System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
/* 26 */                    return (String[]) objArrCopyOf;
                    }
                }

                @Override
                public final void I0000oI00(Bundle bundle, String str, Object obj) {
                    switch (this.I000l1) {
                        case 0:
/* 55 */                    boolean[] zArr = (boolean[]) obj;
/* 57 */                    if (zArr == null) {
/* 63 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 59 */                        bundle.putBooleanArray(str, zArr);
                                break;
                            }
                        case 1:
/* 43 */                    float[] fArr = (float[]) obj;
/* 45 */                    if (fArr == null) {
/* 51 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 47 */                        bundle.putFloatArray(str, fArr);
                                break;
                            }
                        case 2:
/* 31 */                    int[] iArr = (int[]) obj;
/* 33 */                    if (iArr == null) {
/* 39 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 35 */                        bundle.putIntArray(str, iArr);
                                break;
                            }
                        case 3:
/* 19 */                    long[] jArr = (long[]) obj;
/* 21 */                    if (jArr == null) {
/* 27 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 23 */                        bundle.putLongArray(str, jArr);
                                break;
                            }
                        default:
/* 7 */                     String[] strArr = (String[]) obj;
/* 9 */                     if (strArr == null) {
/* 15 */                        bundle.putString(str, null);
                                break;
                            } else {
/* 11 */                        bundle.putStringArray(str, strArr);
                                break;
                            }
                    }
                }
            }
