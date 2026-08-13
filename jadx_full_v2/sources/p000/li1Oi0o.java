            package p000;

            import android.content.SharedPreferences;
            import android.text.TextUtils;
            
            public abstract class li1Oi0o {
                public static final OOol0l1I1 I00000oIO;

                static {
/* 29 */            IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 33 */            Object[] objArr = new Object[24];
/* 38 */            objArr[0] = "Version";
/* 43 */            objArr[1] = "GoogleConsent";
/* 48 */            objArr[2] = "VendorConsent";
/* 53 */            objArr[3] = "VendorLegitimateInterest";
/* 58 */            objArr[4] = "gdprApplies";
/* 63 */            objArr[5] = "EnableAdvertiserConsentMode";
/* 68 */            objArr[6] = "PolicyVersion";
/* 73 */            objArr[7] = "PurposeConsents";
/* 79 */            objArr[8] = "PurposeOneTreatment";
/* 85 */            objArr[9] = "Purpose1";
/* 91 */            objArr[10] = "Purpose3";
/* 97 */            objArr[11] = "Purpose4";
/* 101 */           System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
/* 104 */           l1ioi1lI.I00000oIO(24, objArr);
/* 111 */           I00000oIO = IoillO0OOoo.I000lI(24, objArr);
                }

                public static String I00000oIO(SharedPreferences sharedPreferences, String str) {
                    try {
/* 3 */                 return sharedPreferences.getString(str, "");
                    } catch (ClassCastException unused) {
/* 1 */                 return "";
                    }
                }

                public static final boolean I00000oOI(i1iO0oIi10 i1io0oii10, OOoli1l oOoli1l, OOoli1l oOoli1l2, Ol0i0ill1l ol0i0ill1l, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
                    li1Iii001 li1iii001;
                    char c;
/* 1 */             int iI0000Il00O = I0000Il00O(i1io0oii10);
/* 8 */             if (iI0000Il00O > 0 && (i2 != 1 || i != 1)) {
/* 14 */                cArr[iI0000Il00O] = '2';
                    }
/* 22 */            if (I000II(i1io0oii10, oOoli1l2) == i1iOI1.PURPOSE_RESTRICTION_NOT_ALLOWED) {
/* 24 */                c = '3';
                    } else {
/* 30 */                if (i1io0oii10 == i1iO0oIi10.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && ol0i0ill1l.I00iio.equals(str)) {
/* 42 */                    if (iI0000Il00O > 0 && cArr[iI0000Il00O] != '2') {
/* 50 */                        cArr[iI0000Il00O] = '1';
                            }
/* 7 */                     return true;
                        }
/* 59 */                if (oOoli1l.containsKey(i1io0oii10) && (li1iii001 = (li1Iii001) oOoli1l.get(i1io0oii10)) != null) {
/* 72 */                    int iOrdinal = li1iii001.ordinal();
/* 78 */                    i1iOI1 i1ioi1 = i1iOI1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
/* 80 */                    if (iOrdinal != 0) {
/* 82 */                        i1iOI1 i1ioi12 = i1iOI1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
/* 84 */                        if (iOrdinal != 1) {
/* 87 */                            if (iOrdinal == 2) {
                                        return I000II(i1io0oii10, oOoli1l2) == i1ioi1 ? I0001Ioi1lo(i1io0oii10, cArr, str3, z2) : I0000oI00(i1io0oii10, cArr, str2, z);
                                    }
/* 90 */                            if (iOrdinal == 3) {
                                        return I000II(i1io0oii10, oOoli1l2) == i1ioi12 ? I0000oI00(i1io0oii10, cArr, str2, z) : I0001Ioi1lo(i1io0oii10, cArr, str3, z2);
                                    }
/* 61 */                            c = '0';
                                } else if (I000II(i1io0oii10, oOoli1l2) != i1ioi12) {
/* 133 */                           return I0001Ioi1lo(i1io0oii10, cArr, str3, z2);
                                }
                            } else if (I000II(i1io0oii10, oOoli1l2) != i1ioi1) {
/* 155 */                       return I0000oI00(i1io0oii10, cArr, str2, z);
                            }
/* 131 */                   c = '8';
                        } else {
/* 61 */                    c = '0';
                        }
                    }
/* 145 */           if (iI0000Il00O <= 0 || cArr[iI0000Il00O] == '2') {
/* 153 */               return false;
                    }
/* 151 */           cArr[iI0000Il00O] = c;
/* 153 */           return false;
                }

                public static final int I0000Il00O(i1iO0oIi10 i1io0oii10) {
/* 3 */             if (i1io0oii10 == i1iO0oIi10.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
/* 5 */                 return 1;
                    }
/* 9 */             if (i1io0oii10 == i1iO0oIi10.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
/* 11 */                return 2;
                    }
/* 15 */            if (i1io0oii10 == i1iO0oIi10.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
/* 17 */                return 3;
                    }
                    return i1io0oii10 == i1iO0oIi10.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
                }

                public static final String I0000O(i1iO0oIi10 i1io0oii10, String str, String str2) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(str);
/* 5 */             String strValueOf = OIllioIilO.I01OO1I;
/* 34 */            String strValueOf2 = (zIsEmpty || str.length() < i1io0oii10.zza()) ? OIllioIilO.I01OO1I : String.valueOf(str.charAt(i1io0oii10.zza() - 1));
/* 39 */            if (!TextUtils.isEmpty(str2) && str2.length() >= i1io0oii10.zza()) {
/* 61 */                strValueOf = String.valueOf(str2.charAt(i1io0oii10.zza() - 1));
                    }
/* 73 */            return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
                }

                public static final boolean I0000oI00(i1iO0oIi10 i1io0oii10, char[] cArr, String str, boolean z) {
                    char c;
/* 1 */             int iI0000Il00O = I0000Il00O(i1io0oii10);
/* 8 */             if (!z) {
/* 10 */                c = '4';
                    } else {
/* 21 */                if (str.length() >= i1io0oii10.zza()) {
/* 40 */                    char cCharAt = str.charAt(i1io0oii10.zza() - 1);
/* 46 */                    boolean z2 = cCharAt == '1';
/* 49 */                    if (iI0000Il00O > 0 && cArr[iI0000Il00O] != '2') {
/* 60 */                        cArr[iI0000Il00O] = cCharAt != '1' ? '6' : '1';
                            }
/* 204 */                   return z2;
                        }
/* 23 */                c = '0';
                    }
/* 25 */            if (iI0000Il00O > 0 && cArr[iI0000Il00O] != '2') {
/* 31 */                cArr[iI0000Il00O] = c;
                    }
/* 5 */             return false;
                }

                public static final boolean I0001Ioi1lo(i1iO0oIi10 i1io0oii10, char[] cArr, String str, boolean z) {
                    char c;
/* 1 */             int iI0000Il00O = I0000Il00O(i1io0oii10);
/* 8 */             if (!z) {
/* 10 */                c = '5';
                    } else {
/* 21 */                if (str.length() >= i1io0oii10.zza()) {
/* 40 */                    char cCharAt = str.charAt(i1io0oii10.zza() - 1);
/* 46 */                    boolean z2 = cCharAt == '1';
/* 49 */                    if (iI0000Il00O > 0 && cArr[iI0000Il00O] != '2') {
/* 60 */                        cArr[iI0000Il00O] = cCharAt != '1' ? '7' : '1';
                            }
/* 204 */                   return z2;
                        }
/* 23 */                c = '0';
                    }
/* 25 */            if (iI0000Il00O > 0 && cArr[iI0000Il00O] != '2') {
/* 31 */                cArr[iI0000Il00O] = c;
                    }
/* 5 */             return false;
                }

                public static final i1iOI1 I000II(i1iO0oIi10 i1io0oii10, OOoli1l oOoli1l) {
/* 1 */             Object obj = oOoli1l.get(i1io0oii10);
/* 5 */             if (obj == null) {
/* 8 */                 obj = i1iOI1.PURPOSE_RESTRICTION_UNDEFINED;
                    }
/* 10 */            return (i1iOI1) obj;
                }
            }
