            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Locale;
            import java.util.regex.Matcher;
            
            public abstract class l1IiOI {
                public static O1ii0l1iii I00000oIO(String str) {
/* 3 */             Matcher matcher = O1ii0l1iii.I0000Il00O.matcher(str);
/* 14 */            if (!matcher.lookingAt()) {
/* 171 */               I000II.I0010I0i(IIl001iO0Io.I000iOII('\"', "No subtype found for: \"", str));
/* 11 */                return null;
                    }
/* 17 */            String strGroup = matcher.group(1);
/* 21 */            Locale locale = Locale.US;
/* 23 */            strGroup.toLowerCase(locale);
/* 31 */            matcher.group(2).toLowerCase(locale);
/* 36 */            ArrayList arrayList = new ArrayList();
/* 41 */            Matcher matcher2 = O1ii0l1iii.I0000O.matcher(str);
/* 45 */            int iEnd = matcher.end();
/* 54 */            while (iEnd < str.length()) {
/* 60 */                matcher2.region(iEnd, str.length());
/* 67 */                if (!matcher2.lookingAt()) {
/* 140 */                   IoOOl0iOl1io.I000iOII("Parameter is not formatted correctly: \"", str.substring(iEnd), "\" for: \"", str, 34);
/* 11 */                    return null;
                        }
/* 69 */                String strGroup2 = matcher2.group(1);
/* 73 */                if (strGroup2 == null) {
/* 75 */                    iEnd = matcher2.end();
                        } else {
/* 80 */                    String strGroup3 = matcher2.group(2);
/* 84 */                    if (strGroup3 == null) {
/* 87 */                        strGroup3 = matcher2.group(3);
                            } else if (OlOolloIIOl0.I000l1(strGroup3, "'", false) && OlOolloIIOl0.I000II(strGroup3, "'", false) && strGroup3.length() > 2) {
/* 117 */                       strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                            }
/* 121 */                   arrayList.add(strGroup2);
/* 124 */                   arrayList.add(strGroup3);
/* 127 */                   iEnd = matcher2.end();
                        }
                    }
/* 152 */           String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 154 */           O1ii0l1iii o1ii0l1iii = new O1ii0l1iii();
/* 157 */           o1ii0l1iii.I00000oIO = str;
/* 159 */           o1ii0l1iii.I00000oOI = strArr;
/* 161 */           VarHandle.storeStoreFence();
/* 164 */           return o1ii0l1iii;
                }
            }
