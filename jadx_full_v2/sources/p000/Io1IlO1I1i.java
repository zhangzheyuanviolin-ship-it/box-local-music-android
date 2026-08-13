            package p000;

            import java.util.ArrayList;
            
            public final class Io1IlO1I1i {
                public ArrayList I00000oIO = new ArrayList(20);

                public void I00000oIO(String str, String str2) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             arrayList.add(str);
/* 14 */            arrayList.add(OlOoOIi0o.I00OIo(str2).toString());
                }

                public void I00000oOI(String str, String str2) {
/* 5 */             if (str.length() <= 0) {
/* 57 */                I000II.I000iOII("name is empty");
/* 89 */                return;
                    }
/* 7 */             int length = str.length();
/* 12 */            for (int i = 0; i < length; i++) {
/* 14 */                char cCharAt = str.charAt(i);
/* 20 */                if ('!' > cCharAt || cCharAt >= 127) {
/* 47 */                    I000II.I0010I0i(OollIoI001lo.I000O01llI0("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
/* 50 */                    return;
                        }
                    }
/* 51 */            I00000oIO(str, str2);
                }

                public Io1Io0OOi011 I0000Il00O() {
/* 14 */            return new Io1Io0OOi011((String[]) this.I00000oIO.toArray(new String[0]));
                }

                public void I0000O(String str) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             int i = 0;
/* 8 */             while (i < arrayList.size()) {
/* 20 */                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
/* 22 */                    arrayList.remove(i);
/* 25 */                    arrayList.remove(i);
                            i -= 2;
                        }
/* 30 */                i += 2;
                    }
                }

                public void I0000oI00(String str, String str2) {
/* 1 */             illliIoo1l0O.I00000oIO(str);
/* 4 */             illliIoo1l0O.I00000oOI(str2, str);
/* 7 */             I0000O(str);
/* 10 */            I00000oIO(str, str2);
                }
            }
