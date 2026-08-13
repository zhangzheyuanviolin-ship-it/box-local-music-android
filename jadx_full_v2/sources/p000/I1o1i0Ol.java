            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1o1i0Ol implements IollO0 {
                @Override
                public final OlOO1i11110 I00000oIO(IollOIOOI00 iollOIOOI00) {
/* 1 */             iOlI10l ioli10l = iollOIOOI00.I0000oI00;
/* 3 */             IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 9 */             int iI0001Ioi1lo = ioli10l.I0001Ioi1lo('`');
/* 13 */            IIOOoI iIOOoII000iOII2 = ioli10l.I000iOII();
/* 23 */            while (ioli10l.I00000oOI('`') > 0) {
/* 25 */                IIOOoI iIOOoII000iOII3 = ioli10l.I000iOII();
/* 33 */                if (ioli10l.I0001Ioi1lo('`') == iI0001Ioi1lo) {
/* 37 */                    IOOIOO1lIo iOOIOO1lIo = new IOOIOO1lIo();
/* 52 */                    String strReplace = ioli10l.I0000Il00O(iIOOoII000iOII2, iIOOoII000iOII3).I00000oIO().replace('\n', ' ');
/* 61 */                    if (strReplace.length() >= 3) {
/* 63 */                        int i = 0;
/* 68 */                        if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
/* 82 */                            int length = strReplace.length();
                                    while (true) {
/* 86 */                                if (i >= length) {
/* 98 */                                    i = length;
                                            break;
                                        }
/* 92 */                                if (strReplace.charAt(i) != ' ') {
                                            break;
                                        }
/* 95 */                                i++;
                                    }
/* 99 */                            if (i != length) {
/* 106 */                               strReplace = strReplace.substring(1, strReplace.length() - 1);
                                    }
                                }
                            }
/* 110 */                   iOOIOO1lIo.I000II = strReplace;
/* 112 */                   IIOOoI iIOOoII000iOII4 = ioli10l.I000iOII();
/* 118 */                   OlOO1i11110 olOO1i11110 = new OlOO1i11110(22);
/* 121 */                   olOO1i11110.I00iiI = iOOIOO1lIo;
/* 123 */                   olOO1i11110.I00iiO = iIOOoII000iOII4;
/* 125 */                   VarHandle.storeStoreFence();
/* 128 */                   return olOO1i11110;
                        }
                    }
/* 139 */           OloOO10o oloOO10o = new OloOO10o(ioli10l.I0000Il00O(iIOOoII000iOII, iIOOoII000iOII2).I00000oIO());
/* 144 */           OlOO1i11110 olOO1i111102 = new OlOO1i11110(22);
/* 147 */           olOO1i111102.I00iiI = oloOO10o;
/* 149 */           olOO1i111102.I00iiO = iIOOoII000iOII2;
/* 151 */           VarHandle.storeStoreFence();
/* 186 */           return olOO1i111102;
                }
            }
