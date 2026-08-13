            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Arrays;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0003Jk\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0006HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'¨\u00068"}, d2 = {"Lcom/k2fsa/sherpa/onnx/GenerationConfig;", "", "silenceScale", "", "speed", "sid", "", "referenceAudio", "", "referenceSampleRate", "referenceText", "", "numSteps", "extra", "", "(FFI[FILjava/lang/String;ILjava/util/Map;)V", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "getNumSteps", "()I", "setNumSteps", "(I)V", "getReferenceAudio", "()[F", "setReferenceAudio", "([F)V", "getReferenceSampleRate", "setReferenceSampleRate", "getReferenceText", "()Ljava/lang/String;", "setReferenceText", "(Ljava/lang/String;)V", "getSid", "setSid", "getSilenceScale", "()F", "setSilenceScale", "(F)V", "getSpeed", "setSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 66 */    public final class GenerationConfig {
                private Map<String, String> extra;
                private int numSteps;
                private float[] referenceAudio;
                private int referenceSampleRate;
                private String referenceText;
                private int sid;
                private float silenceScale;
                private float speed;

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                public GenerationConfig(float r3, float r4, int r5, float[] r6, int r7, java.lang.String r8, int r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                        */
                    /*
                        r2 = this;
                        r12 = r11 & 1
                        if (r12 == 0) goto L7
                        r3 = 1045220557(0x3e4ccccd, float:0.2)
                    L7:
                        r12 = r11 & 2
                        if (r12 == 0) goto Ld
                        r4 = 1065353216(0x3f800000, float:1.0)
                    Ld:
                        r12 = r11 & 4
                        r0 = 0
                        if (r12 == 0) goto L13
                        r5 = r0
                    L13:
                        r12 = r11 & 8
                        r1 = 0
                        if (r12 == 0) goto L19
                        r6 = r1
                    L19:
                        r12 = r11 & 16
                        if (r12 == 0) goto L1e
                        r7 = r0
                    L1e:
                        r12 = r11 & 32
                        if (r12 == 0) goto L23
                        r8 = r1
                    L23:
                        r12 = r11 & 64
                        if (r12 == 0) goto L28
                        r9 = 5
                    L28:
                        r11 = r11 & 128(0x80, float:1.794E-43)
                        if (r11 == 0) goto L36
                        r12 = r1
                        r10 = r8
                        r11 = r9
                        r8 = r6
                        r9 = r7
                        r6 = r4
                        r7 = r5
                        r4 = r2
                        r5 = r3
                        goto L3f
                    L36:
                        r12 = r10
                        r11 = r9
                        r9 = r7
                        r10 = r8
                        r7 = r5
                        r8 = r6
                        r5 = r3
                        r6 = r4
                        r4 = r2
                    L3f:
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.k2fsa.sherpa.onnx.GenerationConfig.<init>(float, float, int, float[], int, java.lang.String, int, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
                }

                public static GenerationConfig copy$default(GenerationConfig generationConfig, float f, float f2, int i, float[] fArr, int i2, String str, int i3, Map map, int i4, Object obj) {
/* 3 */             if ((i4 & 1) != 0) {
/* 5 */                 f = generationConfig.silenceScale;
                    }
/* 9 */             if ((i4 & 2) != 0) {
/* 11 */                f2 = generationConfig.speed;
                    }
/* 15 */            if ((i4 & 4) != 0) {
/* 17 */                i = generationConfig.sid;
                    }
/* 21 */            if ((i4 & 8) != 0) {
/* 23 */                fArr = generationConfig.referenceAudio;
                    }
/* 27 */            if ((i4 & 16) != 0) {
/* 29 */                i2 = generationConfig.referenceSampleRate;
                    }
/* 33 */            if ((i4 & 32) != 0) {
/* 35 */                str = generationConfig.referenceText;
                    }
/* 39 */            if ((i4 & 64) != 0) {
/* 41 */                i3 = generationConfig.numSteps;
                    }
/* 45 */            if ((i4 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                map = generationConfig.extra;
                    }
/* 49 */            int i5 = i3;
/* 50 */            Map map2 = map;
/* 51 */            int i6 = i2;
/* 52 */            String str2 = str;
/* 58 */            return generationConfig.copy(f, f2, i, fArr, i6, str2, i5, map2);
                }

                public final float getSilenceScale() {
/* 1 */             return this.silenceScale;
                }

                public final float getSpeed() {
/* 1 */             return this.speed;
                }

                public final int getSid() {
/* 1 */             return this.sid;
                }

                public final float[] getReferenceAudio() {
/* 1 */             return this.referenceAudio;
                }

                public final int getReferenceSampleRate() {
/* 1 */             return this.referenceSampleRate;
                }

                public final String getReferenceText() {
/* 1 */             return this.referenceText;
                }

                public final int getNumSteps() {
/* 1 */             return this.numSteps;
                }

                public final Map<String, String> component8() {
/* 1 */             return this.extra;
                }

                public final GenerationConfig copy(float silenceScale, float speed, int sid, float[] referenceAudio, int referenceSampleRate, String referenceText, int numSteps, Map<String, String> extra) {
/* 3 */             return new GenerationConfig(silenceScale, speed, sid, referenceAudio, referenceSampleRate, referenceText, numSteps, extra);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof GenerationConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            GenerationConfig generationConfig = (GenerationConfig) other;
                    return Float.compare(this.silenceScale, generationConfig.silenceScale) == 0 && Float.compare(this.speed, generationConfig.speed) == 0 && this.sid == generationConfig.sid && O0000Ioio00.I0000O(this.referenceAudio, generationConfig.referenceAudio) && this.referenceSampleRate == generationConfig.referenceSampleRate && O0000Ioio00.I0000O(this.referenceText, generationConfig.referenceText) && this.numSteps == generationConfig.numSteps && O0000Ioio00.I0000O(this.extra, generationConfig.extra);
                }

                public final Map<String, String> getExtra() {
/* 1 */             return this.extra;
                }

                public final int getNumSteps() {
/* 1 */             return this.numSteps;
                }

                public final float[] getReferenceAudio() {
/* 1 */             return this.referenceAudio;
                }

                public final int getReferenceSampleRate() {
/* 1 */             return this.referenceSampleRate;
                }

                public final String getReferenceText() {
/* 1 */             return this.referenceText;
                }

                public final int getSid() {
/* 1 */             return this.sid;
                }

                public final float getSilenceScale() {
/* 1 */             return this.silenceScale;
                }

                public final float getSpeed() {
/* 1 */             return this.speed;
                }

                public int hashCode() {
/* 18 */            int iI0000O = IIl001iO0Io.I0000O(this.sid, OooioIOo1.I0000O(Float.hashCode(this.silenceScale) * 31, 31, this.speed), 31);
/* 22 */            float[] fArr = this.referenceAudio;
/* 37 */            int iI0000O2 = IIl001iO0Io.I0000O(this.referenceSampleRate, (iI0000O + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31, 31);
/* 41 */            String str = this.referenceText;
/* 55 */            int iI0000O3 = IIl001iO0Io.I0000O(this.numSteps, (iI0000O2 + (str == null ? 0 : str.hashCode())) * 31, 31);
/* 59 */            Map<String, String> map = this.extra;
/* 68 */            return iI0000O3 + (map != null ? map.hashCode() : 0);
                }

                public final void setExtra(Map<String, String> map) {
/* 1 */             this.extra = map;
                }

                public final void setNumSteps(int i) {
/* 1 */             this.numSteps = i;
                }

                public final void setReferenceAudio(float[] fArr) {
/* 1 */             this.referenceAudio = fArr;
                }

                public final void setReferenceSampleRate(int i) {
/* 1 */             this.referenceSampleRate = i;
                }

                public final void setReferenceText(String str) {
/* 1 */             this.referenceText = str;
                }

                public final void setSid(int i) {
/* 1 */             this.sid = i;
                }

                public final void setSilenceScale(float f) {
/* 1 */             this.silenceScale = f;
                }

                public final void setSpeed(float f) {
/* 1 */             this.speed = f;
                }

                public String toString() {
/* 92 */            return "GenerationConfig(silenceScale=" + this.silenceScale + ", speed=" + this.speed + ", sid=" + this.sid + ", referenceAudio=" + Arrays.toString(this.referenceAudio) + ", referenceSampleRate=" + this.referenceSampleRate + ", referenceText=" + this.referenceText + ", numSteps=" + this.numSteps + ", extra=" + this.extra + ')';
                }

/* 67 */        public GenerationConfig(float f, float f2, int i, float[] fArr, int i2, String str, int i3, Map<String, String> map) {
/* 69 */            this.silenceScale = f;
/* 70 */            this.speed = f2;
/* 71 */            this.sid = i;
/* 72 */            this.referenceAudio = fArr;
/* 73 */            this.referenceSampleRate = i2;
/* 74 */            this.referenceText = str;
/* 75 */            this.numSteps = i3;
/* 76 */            this.extra = map;
                }

/* 76 */        public GenerationConfig() {
/* 77 */            this(0.0f, 0.0f, 0, null, 0, null, 0, null, 255, null);
                }
            }
