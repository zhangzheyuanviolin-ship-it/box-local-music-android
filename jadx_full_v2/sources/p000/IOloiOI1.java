            package p000;

            import java.net.UnknownServiceException;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            
            public final class IOloiOI1 {
                public int I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public Object I0000O;

                public IOloiOI1(l01O0IO1ooO0 l01o0io1ooo0, int i, boolean z, boolean z2) {
/* 4 */             this.I0000O = l01o0io1ooo0;
/* 6 */             this.I00000oIO = i;
/* 8 */             this.I00000oOI = z;
/* 10 */            this.I0000Il00O = z2;
                }

                public IOloi0IiI I00000oIO(SSLSocket sSLSocket) throws UnknownServiceException {
                    IOloi0IiI iOloi0IiI;
                    int i;
                    boolean z;
/* 1 */             int i2 = this.I00000oIO;
/* 5 */             List list = (List) this.I0000O;
/* 7 */             int size = list.size();
                    while (true) {
/* 12 */                if (i2 >= size) {
/* 33 */                    iOloi0IiI = null;
                            break;
                        }
/* 18 */                iOloi0IiI = (IOloi0IiI) list.get(i2);
/* 24 */                if (iOloi0IiI.I00000oOI(sSLSocket)) {
/* 27 */                    this.I00000oIO = i2 + 1;
                            break;
                        }
/* 30 */                i2++;
                    }
/* 34 */            if (iOloi0IiI == null) {
/* 220 */               StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
/* 225 */               sb.append(this.I0000Il00O);
/* 230 */               sb.append(", modes=");
/* 233 */               sb.append(list);
/* 240 */               String string = Arrays.toString(sSLSocket.getEnabledProtocols());
/* 246 */               sb.append(", supported protocols=");
/* 249 */               sb.append(string);
/* 966 */               throw new UnknownServiceException(sb.toString());
                    }
/* 36 */            int i3 = this.I00000oIO;
/* 38 */            int size2 = list.size();
                    while (true) {
/* 42 */                i = 0;
/* 43 */                if (i3 >= size2) {
/* 62 */                    z = false;
                            break;
                        }
/* 55 */                if (((IOloi0IiI) list.get(i3)).I00000oOI(sSLSocket)) {
/* 57 */                    z = true;
                            break;
                        }
/* 59 */                i3++;
                    }
/* 63 */            this.I00000oOI = z;
/* 65 */            boolean z2 = this.I0000Il00O;
/* 67 */            String[] strArr = iOloi0IiI.I0000O;
/* 69 */            String[] strArr2 = iOloi0IiI.I0000Il00O;
/* 84 */            String[] strArrI000oI1ioi = strArr2 != null ? OollIoI001lo.I000oI1ioi(sSLSocket.getEnabledCipherSuites(), strArr2, IOIIo1OIOi1.I0000Il00O) : sSLSocket.getEnabledCipherSuites();
/* 101 */           String[] strArrI000oI1ioi2 = strArr != null ? OollIoI001lo.I000oI1ioi(sSLSocket.getEnabledProtocols(), strArr, OI1OOoOI.I00iiI) : sSLSocket.getEnabledProtocols();
/* 105 */           String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
/* 109 */           IliIiio1 iliIiio1 = IOIIo1OIOi1.I0000Il00O;
/* 111 */           byte[] bArr = OollIoI001lo.I00000oIO;
/* 113 */           int length = supportedCipherSuites.length;
                    while (true) {
/* 115 */               if (i >= length) {
/* 131 */                   i = -1;
                            break;
                        }
/* 125 */               if (iliIiio1.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                            break;
                        }
/* 128 */               i++;
                    }
/* 132 */           if (z2 && i != -1) {
/* 136 */               String str = supportedCipherSuites[i];
/* 144 */               strArrI000oI1ioi = (String[]) Arrays.copyOf(strArrI000oI1ioi, strArrI000oI1ioi.length + 1);
/* 148 */               strArrI000oI1ioi[strArrI000oI1ioi.length - 1] = str;
                    }
/* 152 */           IOloIIl1 iOloIIl1 = new IOloIIl1();
/* 157 */           iOloIIl1.I00000oIO = iOloi0IiI.I00000oIO;
/* 159 */           iOloIIl1.I0000Il00O = strArr2;
/* 161 */           iOloIIl1.I0000O = strArr;
/* 165 */           iOloIIl1.I00000oOI = iOloi0IiI.I00000oOI;
/* 174 */           iOloIIl1.I0000Il00O((String[]) Arrays.copyOf(strArrI000oI1ioi, strArrI000oI1ioi.length));
/* 184 */           iOloIIl1.I0000oI00((String[]) Arrays.copyOf(strArrI000oI1ioi2, strArrI000oI1ioi2.length));
/* 187 */           IOloi0IiI iOloi0IiII00000oIO = iOloIIl1.I00000oIO();
/* 195 */           if (iOloi0IiII00000oIO.I0000Il00O() != null) {
/* 199 */               sSLSocket.setEnabledProtocols(iOloi0IiII00000oIO.I0000O);
                    }
/* 206 */           if (iOloi0IiII00000oIO.I00000oIO() != null) {
/* 210 */               sSLSocket.setEnabledCipherSuites(iOloi0IiII00000oIO.I0000Il00O);
                    }
/* 213 */           return iOloi0IiI;
                }

                public void I00000oOI(String str) {
/* 16 */            ((l01O0IO1ooO0) this.I0000O).I010l10O(this.I00000oIO, this.I00000oOI, this.I0000Il00O, str, null, null, null);
                }

                public void I0000Il00O(String str, Object obj) {
/* 16 */            ((l01O0IO1ooO0) this.I0000O).I010l10O(this.I00000oIO, this.I00000oOI, this.I0000Il00O, str, obj, null, null);
                }

                public void I0000O(Object obj, String str, Object obj2) {
/* 16 */            ((l01O0IO1ooO0) this.I0000O).I010l10O(this.I00000oIO, this.I00000oOI, this.I0000Il00O, str, obj, obj2, null);
                }

                public void I0000oI00(String str, Object obj, Object obj2, Object obj3) {
/* 16 */            ((l01O0IO1ooO0) this.I0000O).I010l10O(this.I00000oIO, this.I00000oOI, this.I0000Il00O, str, obj, obj2, obj3);
                }
            }
