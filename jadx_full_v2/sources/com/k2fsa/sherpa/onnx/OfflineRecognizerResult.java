            package com.k2fsa.sherpa.onnx;

            import java.util.Arrays;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JZ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineRecognizerResult;", "", "text", "", "tokens", "", "timestamps", "", "lang", "emotion", "event", "durations", "(Ljava/lang/String;[Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[F)V", "getDurations", "()[F", "getEmotion", "()Ljava/lang/String;", "getEvent", "getLang", "getText", "getTimestamps", "getTokens", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;[Ljava/lang/String;[FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[F)Lcom/k2fsa/sherpa/onnx/OfflineRecognizerResult;", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class OfflineRecognizerResult {
                private final float[] durations;
                private final String emotion;
                private final String event;
                private final String lang;
                private final String text;
                private final float[] timestamps;
                private final String[] tokens;

                public OfflineRecognizerResult(String str, String[] strArr, float[] fArr, String str2, String str3, String str4, float[] fArr2) {
/* 4 */             this.text = str;
/* 6 */             this.tokens = strArr;
/* 8 */             this.timestamps = fArr;
/* 10 */            this.lang = str2;
/* 12 */            this.emotion = str3;
/* 14 */            this.event = str4;
/* 16 */            this.durations = fArr2;
                }

                public static OfflineRecognizerResult copy$default(OfflineRecognizerResult offlineRecognizerResult, String str, String[] strArr, float[] fArr, String str2, String str3, String str4, float[] fArr2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineRecognizerResult.text;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                strArr = offlineRecognizerResult.tokens;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                fArr = offlineRecognizerResult.timestamps;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str2 = offlineRecognizerResult.lang;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str3 = offlineRecognizerResult.emotion;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                str4 = offlineRecognizerResult.event;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                fArr2 = offlineRecognizerResult.durations;
                    }
/* 43 */            String str5 = str4;
/* 44 */            float[] fArr3 = fArr2;
/* 46 */            String str6 = str3;
/* 48 */            float[] fArr4 = fArr;
/* 51 */            return offlineRecognizerResult.copy(str, strArr, fArr4, str2, str6, str5, fArr3);
                }

                public final String getText() {
/* 1 */             return this.text;
                }

                public final String[] getTokens() {
/* 1 */             return this.tokens;
                }

                public final float[] getTimestamps() {
/* 1 */             return this.timestamps;
                }

                public final String getLang() {
/* 1 */             return this.lang;
                }

                public final String getEmotion() {
/* 1 */             return this.emotion;
                }

                public final String getEvent() {
/* 1 */             return this.event;
                }

                public final float[] getDurations() {
/* 1 */             return this.durations;
                }

                public final OfflineRecognizerResult copy(String text, String[] tokens, float[] timestamps, String lang, String emotion, String event, float[] durations) {
/* 3 */             return new OfflineRecognizerResult(text, tokens, timestamps, lang, emotion, event, durations);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineRecognizerResult)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineRecognizerResult offlineRecognizerResult = (OfflineRecognizerResult) other;
                    return O0000Ioio00.I0000O(this.text, offlineRecognizerResult.text) && O0000Ioio00.I0000O(this.tokens, offlineRecognizerResult.tokens) && O0000Ioio00.I0000O(this.timestamps, offlineRecognizerResult.timestamps) && O0000Ioio00.I0000O(this.lang, offlineRecognizerResult.lang) && O0000Ioio00.I0000O(this.emotion, offlineRecognizerResult.emotion) && O0000Ioio00.I0000O(this.event, offlineRecognizerResult.event) && O0000Ioio00.I0000O(this.durations, offlineRecognizerResult.durations);
                }

                public final float[] getDurations() {
/* 1 */             return this.durations;
                }

                public final String getEmotion() {
/* 1 */             return this.emotion;
                }

                public final String getEvent() {
/* 1 */             return this.event;
                }

                public final String getLang() {
/* 1 */             return this.lang;
                }

                public final String getText() {
/* 1 */             return this.text;
                }

                public final float[] getTimestamps() {
/* 1 */             return this.timestamps;
                }

                public final String[] getTokens() {
/* 1 */             return this.tokens;
                }

                public int hashCode() {
/* 50 */            return Arrays.hashCode(this.durations) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((Arrays.hashCode(this.timestamps) + (((this.text.hashCode() * 31) + Arrays.hashCode(this.tokens)) * 31)) * 31, 31, this.lang), 31, this.emotion), 31, this.event);
                }

                public String toString() {
/* 90 */            return "OfflineRecognizerResult(text=" + this.text + ", tokens=" + Arrays.toString(this.tokens) + ", timestamps=" + Arrays.toString(this.timestamps) + ", lang=" + this.lang + ", emotion=" + this.emotion + ", event=" + this.event + ", durations=" + Arrays.toString(this.durations) + ')';
                }
            }
