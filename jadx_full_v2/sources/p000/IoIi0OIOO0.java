            package p000;

            import java.net.SocketTimeoutException;
            
            public final class IoIi0OIOO0 extends I1Ool00ioI {
                public final IoIi1I11l11 I000o00OoI0I;

                public IoIi0OIOO0(IoIi1I11l11 ioIi1I11l11) {
/* 1 */             this.I000o00OoI0I = ioIi1I11l11;
                }

                @Override
                public final void I000OiO() {
/* 5 */             this.I000o00OoI0I.I0000oI00(9);
/* 10 */            IoIOii01O ioIOii01O = this.I000o00OoI0I.I00000oOI;
                    synchronized (ioIOii01O) {
/* 13 */                long j = ioIOii01O.I00lll10;
/* 15 */                long j2 = ioIOii01O.I00lli11;
/* 19 */                if (j < j2) {
/* 22 */                    return;
                        }
/* 26 */                ioIOii01O.I00lli11 = j2 + 1;
/* 36 */                ioIOii01O.I00o0iI0io1 = System.nanoTime() + 1000000000;
/* 62 */                ioIOii01O.I00ioIO.I0000Il00O(new IoIOOii1OOi(IIl001iO0Io.I00100l0(new StringBuilder(), ioIOii01O.I00iiO, " ping"), 0, ioIOii01O), 0L);
                    }
                }

                public final void I000iOII() {
/* 5 */             if (I000OOo1O()) {
/* 29 */                throw new SocketTimeoutException("timeout");
                    }
                }
            }
