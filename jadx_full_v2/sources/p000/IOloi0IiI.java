            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Objects;
            import javax.net.ssl.SSLSocket;
            
            public final class IOloi0IiI {
                public static final IOloi0IiI I0000oI00;
                public static final IOloi0IiI I0001Ioi1lo;
                public boolean I00000oIO;
                public boolean I00000oOI;
                public String[] I0000Il00O;
                public String[] I0000O;

                static {
/* 1 */             IOIIo1OIOi1 iOIIo1OIOi1 = IOIIo1OIOi1.I0010I0i;
/* 3 */             IOIIo1OIOi1 iOIIo1OIOi12 = IOIIo1OIOi1.I0010o;
/* 5 */             IOIIo1OIOi1 iOIIo1OIOi13 = IOIIo1OIOi1.I00111O;
/* 7 */             IOIIo1OIOi1 iOIIo1OIOi14 = IOIIo1OIOi1.I000l1;
/* 9 */             IOIIo1OIOi1 iOIIo1OIOi15 = IOIIo1OIOi1.I000o00OoI0I;
/* 11 */            IOIIo1OIOi1 iOIIo1OIOi16 = IOIIo1OIOi1.I000lI;
/* 13 */            IOIIo1OIOi1 iOIIo1OIOi17 = IOIIo1OIOi1.I000oI1ioi;
/* 15 */            IOIIo1OIOi1 iOIIo1OIOi18 = IOIIo1OIOi1.I00100o1O0lo;
/* 17 */            IOIIo1OIOi1 iOIIo1OIOi19 = IOIIo1OIOi1.I00100l0;
/* 19 */            IOIIo1OIOi1[] iOIIo1OIOi1Arr = {iOIIo1OIOi1, iOIIo1OIOi12, iOIIo1OIOi13, iOIIo1OIOi14, iOIIo1OIOi15, iOIIo1OIOi16, iOIIo1OIOi17, iOIIo1OIOi18, iOIIo1OIOi19};
/* 50 */            IOIIo1OIOi1[] iOIIo1OIOi1Arr2 = {iOIIo1OIOi1, iOIIo1OIOi12, iOIIo1OIOi13, iOIIo1OIOi14, iOIIo1OIOi15, iOIIo1OIOi16, iOIIo1OIOi17, iOIIo1OIOi18, iOIIo1OIOi19, IOIIo1OIOi1.I000OiO, IOIIo1OIOi1.I000iOII, IOIIo1OIOi1.I000O01llI0, IOIIo1OIOi1.I000OOo1O, IOIIo1OIOi1.I0001Ioi1lo, IOIIo1OIOi1.I000II, IOIIo1OIOi1.I0000oI00};
/* 56 */            IOloIIl1 iOloIIl1 = new IOloIIl1();
/* 67 */            iOloIIl1.I00000oOI((IOIIo1OIOi1[]) Arrays.copyOf(iOIIo1OIOi1Arr, 9));
/* 70 */            Oo1II0I1llO oo1II0I1llO = Oo1II0I1llO.TLS_1_3;
/* 72 */            Oo1II0I1llO oo1II0I1llO2 = Oo1II0I1llO.TLS_1_2;
/* 78 */            iOloIIl1.I0000O(oo1II0I1llO, oo1II0I1llO2);
/* 82 */            iOloIIl1.I00000oOI = true;
/* 84 */            iOloIIl1.I00000oIO();
/* 89 */            IOloIIl1 iOloIIl12 = new IOloIIl1();
/* 100 */           iOloIIl12.I00000oOI((IOIIo1OIOi1[]) Arrays.copyOf(iOIIo1OIOi1Arr2, 16));
/* 107 */           iOloIIl12.I0000O(oo1II0I1llO, oo1II0I1llO2);
/* 110 */           iOloIIl12.I00000oOI = true;
/* 116 */           I0000oI00 = iOloIIl12.I00000oIO();
/* 120 */           IOloIIl1 iOloIIl13 = new IOloIIl1();
/* 129 */           iOloIIl13.I00000oOI((IOIIo1OIOi1[]) Arrays.copyOf(iOIIo1OIOi1Arr2, 16));
/* 140 */           iOloIIl13.I0000O(oo1II0I1llO, oo1II0I1llO2, Oo1II0I1llO.TLS_1_1, Oo1II0I1llO.TLS_1_0);
/* 143 */           iOloIIl13.I00000oOI = true;
/* 145 */           iOloIIl13.I00000oIO();
/* 150 */           IOloi0IiI iOloi0IiI = new IOloi0IiI();
/* 154 */           iOloi0IiI.I00000oIO = false;
/* 156 */           iOloi0IiI.I00000oOI = false;
/* 159 */           iOloi0IiI.I0000Il00O = null;
/* 161 */           iOloi0IiI.I0000O = null;
/* 163 */           VarHandle.storeStoreFence();
/* 166 */           I0001Ioi1lo = iOloi0IiI;
                }

                public final List I00000oIO() {
/* 1 */             String[] strArr = this.I0000Il00O;
/* 3 */             if (strArr == null) {
/* 34 */                return null;
                    }
/* 8 */             ArrayList arrayList = new ArrayList(strArr.length);
/* 13 */            for (String str : strArr) {
/* 23 */                arrayList.add(IOIIo1OIOi1.I00000oOI.I000iOII(str));
                    }
/* 29 */            return IOOi0Ool1i.I00iIi0i1o(arrayList);
                }

                public final boolean I00000oOI(SSLSocket sSLSocket) {
/* 3 */             if (!this.I00000oIO) {
/* 39 */                return false;
                    }
/* 6 */             String[] strArr = this.I0000O;
/* 8 */             if (strArr != null && !OollIoI001lo.I000OOo1O(strArr, sSLSocket.getEnabledProtocols(), OI1OOoOI.I00iiI)) {
/* 39 */                return false;
                    }
/* 23 */            String[] strArr2 = this.I0000Il00O;
                    return strArr2 == null || OollIoI001lo.I000OOo1O(strArr2, sSLSocket.getEnabledCipherSuites(), IOIIo1OIOi1.I0000Il00O);
                }

                public final List I0000Il00O() {
/* 1 */             String[] strArr = this.I0000O;
/* 3 */             if (strArr == null) {
/* 32 */                return null;
                    }
/* 8 */             ArrayList arrayList = new ArrayList(strArr.length);
/* 13 */            for (String str : strArr) {
/* 21 */                arrayList.add(lOloIoil00.I00000oIO(str));
                    }
/* 27 */            return IOOi0Ool1i.I00iIi0i1o(arrayList);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IOloi0IiI)) {
/* 48 */                return false;
                    }
/* 6 */             if (obj == this) {
/* 50 */                return true;
                    }
/* 9 */             boolean z = this.I00000oIO;
/* 11 */            IOloi0IiI iOloi0IiI = (IOloi0IiI) obj;
/* 15 */            if (z != iOloi0IiI.I00000oIO) {
/* 48 */                return false;
                    }
/* 18 */            if (z) {
                        return Arrays.equals(this.I0000Il00O, iOloi0IiI.I0000Il00O) && Arrays.equals(this.I0000O, iOloi0IiI.I0000O) && this.I00000oOI == iOloi0IiI.I00000oOI;
                    }
/* 50 */            return true;
                }

                public final int hashCode() {
/* 3 */             if (!this.I00000oIO) {
/* 38 */                return 17;
                    }
/* 5 */             String[] strArr = this.I0000Il00O;
/* 19 */            int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
/* 21 */            String[] strArr2 = this.I0000O;
/* 36 */            return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.I00000oOI ? 1 : 0);
                }

                public final String toString() {
/* 3 */             if (!this.I00000oIO) {
/* 5 */                 return "ConnectionSpec()";
                    }
/* 59 */            return "ConnectionSpec(cipherSuites=" + Objects.toString(I00000oIO(), "[all enabled]") + ", tlsVersions=" + Objects.toString(I0000Il00O(), "[all enabled]") + ", supportsTlsExtensions=" + this.I00000oOI + ')';
                }
            }
