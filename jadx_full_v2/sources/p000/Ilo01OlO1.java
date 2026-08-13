            package p000;

            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import java.nio.Buffer;
            
            public abstract class Ilo01OlO1 {
                public final int I00000oIO;
                public int I00000oOI = -1;
                public int I0000Il00O = -1;
                public int I0000O = -1;

                /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Ilo01OlO1(String str, String str2) throws Throwable {
                    int iI000iOII;
                    int iI000iOII2;
                    int iGlCreateProgram;
                    try {
/* 18 */                iI000iOII = Ilo0O01IO.I000iOII(35633, str);
                    } catch (IllegalArgumentException | IllegalStateException e) {
/* 104 */               e = e;
/* 105 */               iI000iOII = -1;
/* 106 */               iI000iOII2 = -1;
                    }
                    try {
/* 25 */                iI000iOII2 = Ilo0O01IO.I000iOII(35632, str2);
                        try {
/* 29 */                    iGlCreateProgram = GLES20.glCreateProgram();
                            try {
/* 35 */                        Ilo0O01IO.I00000oOI("glCreateProgram");
/* 38 */                        GLES20.glAttachShader(iGlCreateProgram, iI000iOII);
/* 41 */                        Ilo0O01IO.I00000oOI("glAttachShader");
/* 44 */                        GLES20.glAttachShader(iGlCreateProgram, iI000iOII2);
/* 47 */                        Ilo0O01IO.I00000oOI("glAttachShader");
/* 50 */                        GLES20.glLinkProgram(iGlCreateProgram);
/* 54 */                        int[] iArr = new int[1];
/* 60 */                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
/* 65 */                        if (iArr[0] == 1) {
/* 67 */                            this.I00000oIO = iGlCreateProgram;
/* 69 */                            I00000oIO();
                                } else {
/* 96 */                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                                }
                            } catch (IllegalArgumentException | IllegalStateException e2) {
/* 73 */                        e = e2;
/* 108 */                       if (iI000iOII != -1) {
/* 110 */                           GLES20.glDeleteShader(iI000iOII);
                                }
/* 113 */                       if (iI000iOII2 != -1) {
/* 115 */                           GLES20.glDeleteShader(iI000iOII2);
                                }
/* 118 */                       if (iGlCreateProgram != -1) {
/* 120 */                           GLES20.glDeleteProgram(iGlCreateProgram);
                                }
/* 332 */                       throw e;
                            }
                        } catch (IllegalArgumentException | IllegalStateException e3) {
/* 97 */                    e = e3;
/* 98 */                    iGlCreateProgram = -1;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e4) {
/* 100 */               e = e4;
/* 101 */               iI000iOII2 = -1;
/* 102 */               iGlCreateProgram = iI000iOII2;
/* 108 */               if (iI000iOII != -1) {
                        }
/* 113 */               if (iI000iOII2 != -1) {
                        }
/* 118 */               if (iGlCreateProgram != -1) {
                        }
/* 332 */               throw e;
                    }
                }

                public final void I00000oIO() {
/* 1 */             int i = this.I00000oIO;
/* 5 */             int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
/* 9 */             this.I0000O = iGlGetAttribLocation;
/* 11 */            Ilo0O01IO.I0000oI00(iGlGetAttribLocation, "aPosition");
/* 16 */            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
/* 20 */            this.I00000oOI = iGlGetUniformLocation;
/* 22 */            Ilo0O01IO.I0000oI00(iGlGetUniformLocation, "uTransMatrix");
/* 27 */            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
/* 31 */            this.I0000Il00O = iGlGetUniformLocation2;
/* 33 */            Ilo0O01IO.I0000oI00(iGlGetUniformLocation2, "uAlphaScale");
                }

                public void I00000oOI() {
/* 3 */             GLES20.glUseProgram(this.I00000oIO);
/* 8 */             Ilo0O01IO.I00000oOI("glUseProgram");
/* 13 */            GLES20.glEnableVertexAttribArray(this.I0000O);
/* 18 */            Ilo0O01IO.I00000oOI("glEnableVertexAttribArray");
/* 30 */            GLES20.glVertexAttribPointer(this.I0000O, 2, 5126, false, 0, (Buffer) Ilo0O01IO.I000O01llI0);
/* 35 */            Ilo0O01IO.I00000oOI("glVertexAttribPointer");
/* 40 */            float[] fArr = new float[16];
/* 43 */            Matrix.setIdentityM(fArr, 0);
/* 49 */            GLES20.glUniformMatrix4fv(this.I00000oOI, 1, false, fArr, 0);
/* 54 */            Ilo0O01IO.I00000oOI("glUniformMatrix4fv");
/* 61 */            GLES20.glUniform1f(this.I0000Il00O, 1.0f);
/* 66 */            Ilo0O01IO.I00000oOI("glUniform1f");
                }
            }
