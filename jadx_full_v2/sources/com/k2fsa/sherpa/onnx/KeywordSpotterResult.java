            package com.k2fsa.sherpa.onnx;

            import java.io.IOException;
            import java.util.Arrays;
            import kotlin.Metadata;
            import p000.I1IoiO1l;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/KeywordSpotterResult;", "", "keyword", "", "tokens", "", "timestamps", "", "(Ljava/lang/String;[Ljava/lang/String;[F)V", "getKeyword", "()Ljava/lang/String;", "getTimestamps", "()[F", "getTokens", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;[Ljava/lang/String;[F)Lcom/k2fsa/sherpa/onnx/KeywordSpotterResult;", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class KeywordSpotterResult {
                private final String keyword;
                private final float[] timestamps;
                private final String[] tokens;

                public KeywordSpotterResult(String str, String[] strArr, float[] fArr) {
/* 4 */             this.keyword = str;
/* 6 */             this.tokens = strArr;
/* 8 */             this.timestamps = fArr;
                }

                public static KeywordSpotterResult copy$default(KeywordSpotterResult keywordSpotterResult, String str, String[] strArr, float[] fArr, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = keywordSpotterResult.keyword;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                strArr = keywordSpotterResult.tokens;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                fArr = keywordSpotterResult.timestamps;
                    }
/* 19 */            return keywordSpotterResult.copy(str, strArr, fArr);
                }

                public final String getKeyword() {
/* 1 */             return this.keyword;
                }

                public final String[] getTokens() {
/* 1 */             return this.tokens;
                }

                public final float[] getTimestamps() {
/* 1 */             return this.timestamps;
                }

                public final KeywordSpotterResult copy(String keyword, String[] tokens, float[] timestamps) {
/* 3 */             return new KeywordSpotterResult(keyword, tokens, timestamps);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof KeywordSpotterResult)) {
/* 7 */                 return false;
                    }
/* 11 */            KeywordSpotterResult keywordSpotterResult = (KeywordSpotterResult) other;
                    return O0000Ioio00.I0000O(this.keyword, keywordSpotterResult.keyword) && O0000Ioio00.I0000O(this.tokens, keywordSpotterResult.tokens) && O0000Ioio00.I0000O(this.timestamps, keywordSpotterResult.timestamps);
                }

                public final String getKeyword() {
/* 1 */             return this.keyword;
                }

                public final float[] getTimestamps() {
/* 1 */             return this.timestamps;
                }

                public final String[] getTokens() {
/* 1 */             return this.tokens;
                }

                public int hashCode() {
/* 24 */            return Arrays.hashCode(this.timestamps) + (((this.keyword.hashCode() * 31) + Arrays.hashCode(this.tokens)) * 31);
                }

                public String toString() throws IOException {
/* 10 */            String strI001lllioOl = I1IoiO1l.I001lllioOl(this.tokens, ", ", null, null, null, 62);
/* 14 */            float[] fArr = this.timestamps;
/* 16 */            KeywordSpotterResult$toString$timestampsStr$1 keywordSpotterResult$toString$timestampsStr$1 = KeywordSpotterResult$toString$timestampsStr$1.INSTANCE;
/* 20 */            StringBuilder sb = new StringBuilder();
/* 25 */            sb.append((CharSequence) "");
/* 30 */            int i = 0;
/* 31 */            for (float f : fArr) {
/* 36 */                i++;
/* 37 */                if (i > 1) {
/* 41 */                    sb.append((CharSequence) ", ");
                        }
/* 44 */                if (keywordSpotterResult$toString$timestampsStr$1 != null) {
/* 56 */                    sb.append((CharSequence) keywordSpotterResult$toString$timestampsStr$1.invoke(Float.valueOf(f)));
                        } else {
/* 64 */                    sb.append((CharSequence) String.valueOf(f));
                        }
                    }
/* 70 */            sb.append((CharSequence) "");
/* 73 */            String string = sb.toString();
/* 81 */            StringBuilder sb2 = new StringBuilder("Keyword: ");
/* 90 */            IIl001iO0Io.I001lIiIIo1O(sb2, this.keyword, "\nTokens: [", strI001lllioOl, "]\nTimestamps: [");
/* 95 */            return IlIi0I0.I000oI1ioi(sb2, string, ']');
                }
            }
