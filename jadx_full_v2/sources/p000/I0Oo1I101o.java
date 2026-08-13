            package p000;

            import android.content.SharedPreferences;
            import java.io.Serializable;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import javax.crypto.Cipher;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0Oo1I101o implements OlOO10OII11 {
                public long I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Serializable I0000O;
                public Object I0000oI00;

                public I0Oo1I101o(lilOOl0 lilool0) {
/* 4 */             this.I0000oI00 = lilool0;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean I00000oIO(long j, l0l1iIIOl l0l1iiiol) {
/* 5 */             if (((ArrayList) this.I0000O) == null) {
/* 12 */                this.I0000O = new ArrayList();
                    }
/* 18 */            if (((ArrayList) this.I0000Il00O) == null) {
/* 25 */                this.I0000Il00O = new ArrayList();
                    }
/* 36 */            if (((ArrayList) this.I0000O).isEmpty() || ((((l0l1iIIOl) ((ArrayList) this.I0000O).get(0)).I001lIiIIo1O() / 1000) / 60) / 60 == ((l0l1iiiol.I001lIiIIo1O() / 1000) / 60) / 60) {
/* 79 */                long jI000l1 = this.I00000oIO + l0l1iiiol.I000l1();
/* 82 */                lilOOl0 lilool0 = (lilOOl0) this.I0000oI00;
/* 95 */                if (!lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l1O)) {
/* 132 */                   lilool0.I00Ol1ll1();
/* 154 */                   if (jI000l1 < Math.max(0, ((Integer) iol1II1ii1i.I000OiO.I00000oIO(null)).intValue())) {
                            }
                        } else if (!((ArrayList) this.I0000O).isEmpty()) {
/* 107 */                   lilool0.I00Ol1ll1();
/* 129 */                   if (jI000l1 < Math.max(0, ((Integer) iol1II1ii1i.I000OiO.I00000oIO(null)).intValue())) {
/* 157 */                       this.I00000oIO = jI000l1;
/* 163 */                       ((ArrayList) this.I0000O).add(l0l1iiiol);
/* 174 */                       ((ArrayList) this.I0000Il00O).add(Long.valueOf(j));
/* 179 */                       l100ll0OOIoO l100ll0ooioo = (l100ll0OOIoO) this.I00000oOI;
/* 211 */                       if (((ArrayList) this.I0000O).size() < Math.max(1, lilool0.I00Ol1ll1().I010o0o0oO(l100ll0ooioo != null ? l100ll0ooioo.I00111O() : null, iol1II1ii1i.I000iOII))) {
/* 206 */                           return true;
                                }
                            }
                        }
                    }
/* 35 */            return false;
                }

                public void I00000oOI() {
/* 3 */             l0Oi0o l0oi0o = (l0Oi0o) this.I0000oI00;
/* 5 */             l0oi0o.I010II();
/* 14 */            ((l0olllO1i) l0oi0o.I00iOIl).I00li1OI.getClass();
/* 17 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            SharedPreferences.Editor editorEdit = l0oi0o.I010ioo().edit();
/* 33 */            editorEdit.remove((String) this.I0000Il00O);
/* 40 */            editorEdit.remove((String) this.I0000O);
/* 47 */            editorEdit.putLong((String) this.I00000oOI, jCurrentTimeMillis);
/* 50 */            editorEdit.apply();
                }

                @Override
                public synchronized void I0001Ioi1lo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
                    try {
/* 22 */                ((Cipher) this.I0000Il00O).init(1, (SecretKeySpec) this.I00000oOI, I0OoI1.I000OOo1O((byte[]) this.I0000O, this.I00000oIO, false));
                        this.I00000oIO++;
/* 32 */                boolean zHasRemaining = byteBuffer2.hasRemaining();
/* 38 */                Cipher cipher = (Cipher) this.I0000Il00O;
/* 40 */                if (zHasRemaining) {
/* 42 */                    cipher.update(byteBuffer, byteBuffer3);
/* 49 */                    ((Cipher) this.I0000Il00O).doFinal(byteBuffer2, byteBuffer3);
                        } else {
/* 55 */                    cipher.doFinal(byteBuffer, byteBuffer3);
                        }
                    } catch (Throwable th) {
/* 98 */                throw th;
                    }
                }

                @Override
                public ByteBuffer I000OOo1O() {
/* 5 */             return ((ByteBuffer) this.I0000oI00).asReadOnlyBuffer();
                }

                @Override
                public synchronized void I000OiO(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
/* 21 */            ((Cipher) this.I0000Il00O).init(1, (SecretKeySpec) this.I00000oOI, I0OoI1.I000OOo1O((byte[]) this.I0000O, this.I00000oIO, true));
                    this.I00000oIO++;
/* 35 */            ((Cipher) this.I0000Il00O).doFinal(byteBuffer, byteBuffer2);
                }
            }
