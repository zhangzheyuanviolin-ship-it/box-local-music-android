            package p000;

            import java.net.ProxySelector;
            import java.util.List;
            import java.util.Objects;
            import javax.net.SocketFactory;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLSocketFactory;
            
            public final class I0OI0o0lO {
                public i1O10l1io1iO I00000oIO;
                public SocketFactory I00000oOI;
                public SSLSocketFactory I0000Il00O;
                public HostnameVerifier I0000O;
                public IO0lll0O I0000oI00;
                public iOloo0O0O I0001Ioi1lo;
                public ProxySelector I000II;
                public IoOi01OlIl1o I000O01llI0;
                public List I000OOo1O;
                public List I000OiO;

                public final boolean I00000oIO(I0OI0o0lO i0OI0o0lO) {
                    return O0000Ioio00.I0000O(this.I00000oIO, i0OI0o0lO.I00000oIO) && O0000Ioio00.I0000O(this.I0001Ioi1lo, i0OI0o0lO.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000OOo1O, i0OI0o0lO.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, i0OI0o0lO.I000OiO) && O0000Ioio00.I0000O(this.I000II, i0OI0o0lO.I000II) && O0000Ioio00.I0000O(this.I0000Il00O, i0OI0o0lO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, i0OI0o0lO.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, i0OI0o0lO.I0000oI00) && this.I000O01llI0.I0000oI00 == i0OI0o0lO.I000O01llI0.I0000oI00;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I0OI0o0lO)) {
/* 25 */                return false;
                    }
/* 7 */             I0OI0o0lO i0OI0o0lO = (I0OI0o0lO) obj;
                    return O0000Ioio00.I0000O(this.I000O01llI0, i0OI0o0lO.I000O01llI0) && I00000oIO(i0OI0o0lO);
                }

                public final int hashCode() {
/* 72 */            return Objects.hashCode(this.I0000oI00) + ((Objects.hashCode(this.I0000O) + ((Objects.hashCode(this.I0000Il00O) + ((this.I000II.hashCode() + IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00((this.I0001Ioi1lo.hashCode() + ((this.I00000oIO.hashCode() + Oi010OO0.I000O01llI0(527, 31, this.I000O01llI0.I000O01llI0)) * 31)) * 31, 31, this.I000OOo1O), 31, this.I000OiO)) * 961)) * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Address{");
/* 8 */             IoOi01OlIl1o ioOi01OlIl1o = this.I000O01llI0;
/* 12 */            sb.append(ioOi01OlIl1o.I0000O);
/* 17 */            sb.append(':');
/* 22 */            sb.append(ioOi01OlIl1o.I0000oI00);
/* 27 */            sb.append(", ");
/* 46 */            sb.append("proxySelector=" + this.I000II);
/* 51 */            sb.append('}');
/* 54 */            return sb.toString();
                }
            }
