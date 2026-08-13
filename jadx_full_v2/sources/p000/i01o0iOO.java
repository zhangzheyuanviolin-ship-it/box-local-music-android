            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            
            public final class i01o0iOO extends I0OIloi0O1 {
                public static i01o0iOO I00000oIO(Io1lOlI io1lOlI, O1OIll00i o1OIll00i, Integer num) throws GeneralSecurityException {
/* 3 */             IIOIlli0IO iIOIlli0IO = (IIOIlli0IO) o1OIll00i.I00iiI;
/* 5 */             Io1lOlI io1lOlI2 = Io1lOlI.I000OOo1O;
/* 8 */             if (io1lOlI != io1lOlI2 && num == null) {
/* 17 */                OIiilo1Ool0o.I000oI1ioi(io1lOlI, "For given Variant ", " the value of idRequirement must be non-null");
/* 7 */                 return null;
                    }
/* 21 */            if (io1lOlI == io1lOlI2 && num != null) {
/* 28 */                IioIoO10iOiI.I000oI1ioi("For given Variant NO_PREFIX the value of idRequirement must be null");
/* 7 */                 return null;
                    }
/* 37 */            if (iIOIlli0IO.I00000oIO.length != 32) {
/* 215 */               throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + iIOIlli0IO.I00000oIO.length);
                    }
/* 42 */            if (io1lOlI == io1lOlI2) {
/* 46 */                IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (io1lOlI == Io1lOlI.I000O01llI0) {
/* 75 */                IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                    } else {
/* 81 */                if (io1lOlI != Io1lOlI.I000II) {
/* 113 */                   IoOOl0iOl1io.I000OOo1O("Unknown Variant: ", io1lOlI);
/* 7 */                     return null;
                        }
/* 104 */               IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                    }
/* 107 */           return new i01o0iOO();
                }
            }
