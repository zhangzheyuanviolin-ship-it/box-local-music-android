            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioEvent;", "", "name", "", "index", "", "prob", "", "(Ljava/lang/String;IF)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getProb", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class AudioEvent {
                private final int index;
                private final String name;
                private final float prob;

                public AudioEvent(String str, int i, float f) {
/* 4 */             this.name = str;
/* 6 */             this.index = i;
/* 8 */             this.prob = f;
                }

                public static AudioEvent copy$default(AudioEvent audioEvent, String str, int i, float f, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = audioEvent.name;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                i = audioEvent.index;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                f = audioEvent.prob;
                    }
/* 19 */            return audioEvent.copy(str, i, f);
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final int getIndex() {
/* 1 */             return this.index;
                }

                public final float getProb() {
/* 1 */             return this.prob;
                }

                public final AudioEvent copy(String name, int index, float prob) {
/* 3 */             return new AudioEvent(name, index, prob);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AudioEvent)) {
/* 7 */                 return false;
                    }
/* 11 */            AudioEvent audioEvent = (AudioEvent) other;
                    return O0000Ioio00.I0000O(this.name, audioEvent.name) && this.index == audioEvent.index && Float.compare(this.prob, audioEvent.prob) == 0;
                }

                public final int getIndex() {
/* 1 */             return this.index;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final float getProb() {
/* 1 */             return this.prob;
                }

                public int hashCode() {
/* 22 */            return Float.hashCode(this.prob) + IIl001iO0Io.I0000O(this.index, this.name.hashCode() * 31, 31);
                }

                public String toString() {
/* 38 */            return "AudioEvent(name=" + this.name + ", index=" + this.index + ", prob=" + this.prob + ')';
                }
            }
