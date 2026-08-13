            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            
            public final class IOloIIl1 {
                public boolean I00000oIO = true;
                public boolean I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public IOloi0IiI I00000oIO() {
/* 3 */             boolean z = this.I00000oIO;
/* 5 */             boolean z2 = this.I00000oOI;
/* 9 */             String[] strArr = (String[]) this.I0000Il00O;
/* 13 */            String[] strArr2 = (String[]) this.I0000O;
/* 15 */            IOloi0IiI iOloi0IiI = new IOloi0IiI();
/* 18 */            iOloi0IiI.I00000oIO = z;
/* 20 */            iOloi0IiI.I00000oOI = z2;
/* 22 */            iOloi0IiI.I0000Il00O = strArr;
/* 24 */            iOloi0IiI.I0000O = strArr2;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            return iOloi0IiI;
                }

                public void I00000oOI(IOIIo1OIOi1... iOIIo1OIOi1Arr) {
/* 3 */             if (!this.I00000oIO) {
/* 47 */                I000II.I000iOII("no cipher suites for cleartext connections");
/* 186 */               return;
                    }
/* 8 */             ArrayList arrayList = new ArrayList(iOIIo1OIOi1Arr.length);
/* 14 */            for (IOIIo1OIOi1 iOIIo1OIOi1 : iOIIo1OIOi1Arr) {
/* 20 */                arrayList.add(iOIIo1OIOi1.I00000oIO);
                    }
/* 32 */            String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 41 */            I0000Il00O((String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public void I0000Il00O(String... strArr) {
/* 3 */             if (!this.I00000oIO) {
/* 25 */                I000II.I000iOII("no cipher suites for cleartext connections");
                    } else if (strArr.length != 0) {
/* 14 */                this.I0000Il00O = (String[]) strArr.clone();
                    } else {
/* 19 */                I000II.I000iOII("At least one cipher suite is required");
                    }
                }

                public void I0000O(Oo1II0I1llO... oo1II0I1llOArr) {
/* 3 */             if (!this.I00000oIO) {
/* 47 */                I000II.I000iOII("no TLS versions for cleartext connections");
/* 186 */               return;
                    }
/* 8 */             ArrayList arrayList = new ArrayList(oo1II0I1llOArr.length);
/* 14 */            for (Oo1II0I1llO oo1II0I1llO : oo1II0I1llOArr) {
/* 20 */                arrayList.add(oo1II0I1llO.I00iOIl);
                    }
/* 32 */            String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 41 */            I0000oI00((String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public void I0000oI00(String... strArr) {
/* 3 */             if (!this.I00000oIO) {
/* 25 */                I000II.I000iOII("no TLS versions for cleartext connections");
                    } else if (strArr.length != 0) {
/* 14 */                this.I0000O = (String[]) strArr.clone();
                    } else {
/* 19 */                I000II.I000iOII("At least one TLS version is required");
                    }
                }
            }
