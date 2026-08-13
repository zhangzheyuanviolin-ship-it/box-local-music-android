            package p000;
            
            public final class IoOIOIOiI10O implements Oil1i1 {
                public int I00000oIO;
                public IoIlI1oli I00000oOI;
                public int I0000Il00O;
                public IoIlIolo10o I0000O;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IoO10oI0o ioO10oI0o, IOoilo iOoilo) throws Throwable {
                    IoOIIl ioOIIl;
/* 1 */             int i = this.I00000oIO;
/* 5 */             if (iOoilo instanceof IoOIIl) {
/* 8 */                 ioOIIl = (IoOIIl) iOoilo;
/* 10 */                int i2 = ioOIIl.I00iiO;
/* 16 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 19 */                    ioOIIl.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ioOIIl = new IoOIIl(this, iOoilo);
                        }
                    }
/* 27 */            Object objI00000oIO = ioOIIl.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i3 = ioOIIl.I00iiO;
/* 35 */            if (i3 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 52 */                IoIlIolo10o ioIlIolo10o = this.I0000O;
/* 54 */                if (ioIlIolo10o != null) {
/* 56 */                    il001oo1.I00000oOI(ioIlIolo10o, null);
                        }
/* 59 */                int i4 = this.I0000Il00O;
/* 61 */                if (i4 >= i) {
/* 551 */                   throw new IOIoIlIlO(IIlIOloOOO.I00100l0("Max send count ", i, " exceeded. Consider increasing the property maxSendCount if more is required."), 7);
                        }
/* 64 */                this.I0000Il00O = i4 + 1;
/* 68 */                IoO0l0Iiioll ioO0l0Iiioll = this.I00000oOI.I00ilO0;
/* 70 */                Object obj = ioO10oI0o.I0000O;
/* 72 */                ioOIIl.I00iiO = 1;
/* 74 */                objI00000oIO = ioO0l0Iiioll.I00000oIO(ioO10oI0o, obj, ioOIIl);
/* 78 */                if (objI00000oIO == ii0111o) {
/* 80 */                    return ii0111o;
                        }
                    } else {
/* 37 */                if (i3 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 89 */            IoIlIolo10o ioIlIolo10o2 = objI00000oIO instanceof IoIlIolo10o ? (IoIlIolo10o) objI00000oIO : null;
/* 90 */            if (ioIlIolo10o2 != null) {
/* 92 */                this.I0000O = ioIlIolo10o2;
/* 94 */                return ioIlIolo10o2;
                    }
/* 97 */            IOOlIIilOl0.I000lI("Failed to execute send pipeline. Expected [HttpClientCall], but received ", objI00000oIO);
/* 33 */            return null;
                }
            }
