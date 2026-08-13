            package p000;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.nio.charset.CharsetDecoder;
            import java.nio.charset.CodingErrorAction;
            
            public final class OIIl00o10 implements i0I0IloiO1l {
                public static final String I00iiO = String.valueOf('?');
                public final Charset I00iOIl;
                public final boolean I00iiI;

                public OIIl00o10(Charset charset, boolean z) {
/* 4 */             this.I00iOIl = charset;
/* 6 */             this.I00iiI = z;
                }

                @Override
                public final String I00000oOI(byte[] bArr) {
                    CharsetDecoder charsetDecoderReplaceWith;
/* 1 */             boolean z = this.I00iiI;
/* 3 */             Charset charset = this.I00iOIl;
/* 5 */             if (z) {
/* 22 */                CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
/* 26 */                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
/* 38 */                charsetDecoderReplaceWith = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(I00iiO);
                    } else {
/* 7 */                 CharsetDecoder charsetDecoderNewDecoder2 = charset.newDecoder();
/* 11 */                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
/* 17 */                charsetDecoderReplaceWith = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
                    }
/* 50 */            return charsetDecoderReplaceWith.decode(ByteBuffer.wrap(bArr)).toString();
                }
            }
