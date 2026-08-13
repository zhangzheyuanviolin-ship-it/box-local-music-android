            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            
            public final class IO0o0ll extends I0OIloi0O1 {
                public static IO0o0ll I00000oIO(IO0o1O0li0 iO0o1O0li0, O1OIll00i o1OIll00i, Integer num) throws GeneralSecurityException {
/* 3 */             IIOIlli0IO iIOIlli0IO = (IIOIlli0IO) o1OIll00i.I00iiI;
/* 5 */             IO0o1O0li0 iO0o1O0li02 = IO0o1O0li0.I00ilI0I1;
/* 8 */             if (iO0o1O0li0 != iO0o1O0li02 && num == null) {
/* 17 */                OIiilo1Ool0o.I000oI1ioi(iO0o1O0li0, "For given Variant ", " the value of idRequirement must be non-null");
/* 7 */                 return null;
                    }
/* 21 */            if (iO0o1O0li0 == iO0o1O0li02 && num != null) {
/* 28 */                IioIoO10iOiI.I000oI1ioi("For given Variant NO_PREFIX the value of idRequirement must be null");
/* 7 */                 return null;
                    }
/* 37 */            if (iIOIlli0IO.I00000oIO.length != 32) {
/* 215 */               throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + iIOIlli0IO.I00000oIO.length);
                    }
/* 42 */            if (iO0o1O0li0 == iO0o1O0li02) {
/* 46 */                IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (iO0o1O0li0 == IO0o1O0li0.I00iio) {
/* 75 */                IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                    } else {
/* 81 */                if (iO0o1O0li0 != IO0o1O0li0.I00iiO) {
/* 113 */                   IoOOl0iOl1io.I000OOo1O("Unknown Variant: ", iO0o1O0li0);
/* 7 */                     return null;
                        }
/* 104 */               IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                    }
/* 107 */           return new IO0o0ll();
                }
            }
