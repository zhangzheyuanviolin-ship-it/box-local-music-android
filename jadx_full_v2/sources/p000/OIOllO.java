            package p000;

            import java.security.cert.CertificateParsingException;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLException;
            import javax.net.ssl.SSLSession;
            
            public final class OIOllO implements HostnameVerifier {
                public static final OIOllO I00000oIO = new OIOllO();

                public static List I00000oIO(X509Certificate x509Certificate, int i) throws CertificateParsingException {
                    Collection<List<?>> subjectAlternativeNames;
                    Object obj;
                    try {
/* 1 */                 subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                    } catch (CertificateParsingException unused) {
                    }
/* 5 */             if (subjectAlternativeNames == null) {
/* 69 */                return Il01100l.I00iOIl;
                    }
/* 10 */            ArrayList arrayList = new ArrayList();
/* 21 */            for (List<?> list : subjectAlternativeNames) {
/* 29 */                if (list != null && list.size() >= 2 && O0000Ioio00.I0000O(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
/* 64 */                    arrayList.add((String) obj);
                        }
                    }
/* 68 */            return arrayList;
                }

                public static boolean I00000oOI(String str) {
                    long j;
/* 1 */             int length = str.length();
/* 5 */             int length2 = str.length();
/* 10 */            if (length2 < 0) {
/* 134 */               I000II.I0010I0i(IIlIOloOOO.I00100l0("endIndex < beginIndex: ", length2, " < 0"));
/* 9 */                 return false;
                    }
/* 16 */            if (length2 > str.length()) {
/* 101 */               StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("endIndex > string.length: ", length2, " > ");
/* 109 */               sbI00100o1O0lo.append(str.length());
/* 125 */               throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                    }
/* 18 */            long j2 = 0;
/* 20 */            int i = 0;
/* 21 */            while (i < length2) {
/* 23 */                char cCharAt = str.charAt(i);
/* 31 */                if (cCharAt < 128) {
/* 33 */                    j2++;
                        } else {
/* 39 */                    if (cCharAt < 2048) {
/* 41 */                        j = 2;
                            } else if (cCharAt < 55296 || cCharAt > 57343) {
/* 88 */                        j = 3;
                            } else {
/* 56 */                        int i2 = i + 1;
/* 65 */                        char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
/* 69 */                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
/* 85 */                            j2++;
/* 86 */                            i = i2;
                                } else {
/* 81 */                            j2 += 4;
/* 82 */                            i += 2;
                                }
                            }
/* 43 */                    j2 += j;
                        }
/* 34 */                i++;
                    }
                    return length == ((int) j2);
                }

                /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I0000Il00O(String str, X509Certificate x509Certificate) throws CertificateParsingException {
                    boolean zEquals;
                    int length;
/* 9 */             if (OollIoI001lo.I0001Ioi1lo.I0000O(str)) {
/* 11 */                String strI00000oOI = iloo10Oil.I00000oOI(str);
/* 16 */                List listI00000oIO = I00000oIO(x509Certificate, 7);
/* 24 */                if (!(listI00000oIO instanceof Collection) || !listI00000oIO.isEmpty()) {
/* 37 */                    Iterator it = listI00000oIO.iterator();
/* 45 */                    while (it.hasNext()) {
/* 61 */                        if (O0000Ioio00.I0000O(strI00000oOI, iloo10Oil.I00000oOI((String) it.next()))) {
/* 7 */                             return true;
                                }
                            }
                        }
/* 8 */                 return false;
                    }
/* 69 */            if (I00000oOI(str)) {
/* 73 */                str = str.toLowerCase(Locale.US);
                    }
/* 78 */            List<String> listI00000oIO2 = I00000oIO(x509Certificate, 2);
/* 86 */            if (!(listI00000oIO2 instanceof Collection) || !listI00000oIO2.isEmpty()) {
/* 107 */               for (String lowerCase : listI00000oIO2) {
/* 119 */                   if (str.length() != 0 && !OlOolloIIOl0.I000l1(str, ".", false) && !OlOolloIIOl0.I000II(str, "..", false) && lowerCase != null && lowerCase.length() != 0 && !OlOolloIIOl0.I000l1(lowerCase, ".", false) && !OlOolloIIOl0.I000II(lowerCase, "..", false)) {
/* 173 */                       String strConcat = !OlOolloIIOl0.I000II(str, ".", false) ? str.concat(".") : str;
/* 178 */                       if (!OlOolloIIOl0.I000II(lowerCase, ".", false)) {
/* 180 */                           lowerCase = lowerCase.concat(".");
                                }
/* 188 */                       if (I00000oOI(lowerCase)) {
/* 192 */                           lowerCase = lowerCase.toLowerCase(Locale.US);
                                }
/* 202 */                       if (!OlOoOIi0o.I000oI1ioi(lowerCase, "*", false)) {
/* 204 */                           zEquals = strConcat.equals(lowerCase);
                                } else if (!OlOolloIIOl0.I000l1(lowerCase, "*.", false) || OlOoOIi0o.I001i1O0Ol(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
/* 238 */                           zEquals = false;
                                } else {
/* 247 */                           String strSubstring = lowerCase.substring(1);
/* 255 */                           if (OlOolloIIOl0.I000II(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || OlOoOIi0o.I001lllioOl(strConcat, '.', length - 1, 4) == -1)) {
/* 280 */                               zEquals = true;
                                    }
                                }
/* 281 */                       if (zEquals) {
                                }
                            }
/* 7 */                     return true;
                        }
                    }
/* 8 */             return false;
                }

                @Override
                public final boolean verify(String str, SSLSession sSLSession) {
/* 6 */             if (I00000oOI(str)) {
                        try {
/* 17 */                    return I0000Il00O(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
                        } catch (SSLException unused) {
                        }
                    }
/* 5 */             return false;
                }
            }
