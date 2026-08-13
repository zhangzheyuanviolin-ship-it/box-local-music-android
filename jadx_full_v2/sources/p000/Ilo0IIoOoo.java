            package p000;

            import android.opengl.GLES20;
            import java.nio.Buffer;
            import java.util.Locale;
            
/* 115 */   public final class Ilo0IIoOoo extends Ilo01OlO1 {
                public final int I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;

                /* JADX WARN: Illegal instructions before constructor call */
                public Ilo0IIoOoo(Iio1oiI iio1oiI, IlloioioiI1O illoioioiI1O) {
                    String str;
/* 12 */            String str2 = iio1oiI.I00000oIO() ? Ilo0O01IO.I0000O : Ilo0O01IO.I0000Il00O;
                    try {
                        switch (illoioioiI1O.I00000oIO) {
                            case 0:
/* 31 */                        Locale locale = Locale.US;
/* 33 */                        str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                                break;
                            case 1:
/* 26 */                        Locale locale2 = Locale.US;
/* 28 */                        str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                                break;
                            default:
/* 21 */                        Locale locale3 = Locale.US;
/* 23 */                        str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                                break;
                        }
/* 39 */                if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
/* 101 */                   throw new IllegalArgumentException("Invalid fragment shader");
                        }
/* 47 */                super(str2, str);
/* 51 */                this.I0000oI00 = -1;
/* 53 */                this.I0001Ioi1lo = -1;
/* 55 */                this.I000II = -1;
/* 57 */                I00000oIO();
/* 60 */                int i = this.I00000oIO;
/* 62 */                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
/* 66 */                this.I0000oI00 = iGlGetUniformLocation;
/* 68 */                Ilo0O01IO.I0000oI00(iGlGetUniformLocation, "sTexture");
/* 73 */                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
/* 77 */                this.I000II = iGlGetAttribLocation;
/* 79 */                Ilo0O01IO.I0000oI00(iGlGetAttribLocation, "aTextureCoord");
/* 84 */                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
/* 88 */                this.I0001Ioi1lo = iGlGetUniformLocation2;
/* 90 */                Ilo0O01IO.I0000oI00(iGlGetUniformLocation2, "uTexMatrix");
                    } catch (Throwable th) {
/* 105 */               if (!(th instanceof IllegalArgumentException)) {
/* 115 */                   throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
                        }
/* 107 */               throw th;
                    }
                }

                @Override
                public final void I00000oOI() {
/* 1 */             super.I00000oOI();
/* 7 */             GLES20.glUniform1i(this.I0000oI00, 0);
/* 12 */            GLES20.glEnableVertexAttribArray(this.I000II);
/* 17 */            Ilo0O01IO.I00000oOI("glEnableVertexAttribArray");
/* 29 */            GLES20.glVertexAttribPointer(this.I000II, 2, 5126, false, 0, (Buffer) Ilo0O01IO.I000OOo1O);
/* 34 */            Ilo0O01IO.I00000oOI("glVertexAttribPointer");
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 116 */       public Ilo0IIoOoo(Iio1oiI iio1oiI, Ilo01Io ilo01Io) {
                    IlloioioiI1O illoioioiI1O;
/* 117 */           if (iio1oiI.I00000oIO()) {
/* 118 */               lII1OI11o1I.I00000oIO("No default sampler shader available for" + ilo01Io, ilo01Io != Ilo01Io.I00iOIl);
/* 119 */               if (ilo01Io == Ilo01Io.I00iiO) {
/* 120 */                   illoioioiI1O = Ilo0O01IO.I000II;
                        } else {
/* 121 */                   illoioioiI1O = Ilo0O01IO.I0001Ioi1lo;
                        }
                    } else {
/* 122 */               illoioioiI1O = Ilo0O01IO.I0000oI00;
                    }
/* 123 */           this(iio1oiI, illoioioiI1O);
                }
            }
