            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.regex.Pattern;
            
            public final class IIOO01 {
                public static final String I0000Il00O;
                public static final Set I0000O;
                public static final IIOO01 I0000oI00;
                public static final IIOO01 I0001Ioi1lo;
                public final String I00000oIO;
                public final String I00000oOI;

                static {
/* 5 */             String strI00000oIO = lOOoOoI.I00000oIO("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
/* 9 */             I0000Il00O = strI00000oIO;
/* 15 */            String strI00000oIO2 = lOOoOoI.I00000oIO("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
/* 23 */            String strI00000oIO3 = lOOoOoI.I00000oIO("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
/* 56 */            I0000O = Collections.unmodifiableSet(new HashSet(Arrays.asList(Il0IIil.I00000oIO("proto"), Il0IIil.I00000oIO("json"))));
/* 64 */            I0000oI00 = new IIOO01(strI00000oIO, null);
/* 71 */            I0001Ioi1lo = new IIOO01(strI00000oIO2, strI00000oIO3);
                }

                public IIOO01(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public static IIOO01 I00000oIO(byte[] bArr) {
/* 9 */             String str = new String(bArr, Charset.forName("UTF-8"));
/* 19 */            if (!str.startsWith("1$")) {
/* 79 */                I000II.I000iOII("Version marker missing from extras");
/* 18 */                return null;
                    }
/* 32 */            String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
/* 37 */            if (strArrSplit.length != 2) {
/* 73 */                I000II.I000iOII("Extra is not a valid encoded LegacyFlgDestination");
/* 18 */                return null;
                    }
/* 40 */            String str2 = strArrSplit[0];
/* 46 */            if (str2.isEmpty()) {
/* 67 */                I000II.I000iOII("Missing endpoint in CCTDestination extras");
/* 18 */                return null;
                    }
/* 49 */            String str3 = strArrSplit[1];
/* 61 */            return new IIOO01(str2, str3.isEmpty() ? null : str3);
                }
            }
