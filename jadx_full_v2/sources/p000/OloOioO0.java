            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BlendMode;
            import android.graphics.Canvas;
            import android.graphics.DrawFilter;
            import android.graphics.Matrix;
            import android.graphics.NinePatch;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Picture;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.graphics.RenderNode;
            import android.graphics.fonts.Font;
            import android.graphics.text.MeasuredText;
            
/* 7 */     public final class OloOioO0 extends Canvas {
                public Canvas I00000oIO;

                public final Canvas I00000oIO() {
/* 1 */             Canvas canvas = this.I00000oIO;
/* 3 */             if (canvas != null) {
/* 5 */                 return canvas;
                    }
/* 8 */             Ioliol.I0000O("Text drawing wrapper is missing a Canvas!");
/* 11 */            IOOlIIilOl0.I0000Il00O();
/* 14 */            return null;
                }

                @Override
                public final boolean clipOutPath(Path path) {
/* 5 */             return I00000oIO().clipOutPath(path);
                }

                @Override
                public final boolean clipOutRect(RectF rectF) {
/* 5 */             return I00000oIO().clipOutRect(rectF);
                }

                @Override
                public final boolean clipPath(Path path, Region.Op op) {
/* 5 */             return I00000oIO().clipPath(path, op);
                }

                @Override
                public final boolean clipRect(RectF rectF, Region.Op op) {
/* 5 */             return I00000oIO().clipRect(rectF, op);
                }

                @Override
                public final void concat(Matrix matrix) {
/* 5 */             I00000oIO().concat(matrix);
                }

                @Override
                public final void disableZ() {
/* 5 */             I00000oIO().disableZ();
                }

                @Override
                public final void drawARGB(int i, int i2, int i3, int i4) {
/* 5 */             I00000oIO().drawARGB(i, i2, i3, i4);
                }

                @Override
                public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
/* 5 */             I00000oIO().drawArc(rectF, f, f2, z, paint);
                }

                @Override
                public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
/* 5 */             I00000oIO().drawBitmap(bitmap, f, f2, paint);
                }

                @Override
                public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
/* 5 */             I00000oIO().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
                }

                @Override
                public final void drawCircle(float f, float f2, float f3, Paint paint) {
/* 5 */             I00000oIO().drawCircle(f, f2, f3, paint);
                }

                @Override
                public final void drawColor(int i) {
/* 5 */             I00000oIO().drawColor(i);
                }

                @Override
                public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
/* 5 */             I00000oIO().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
                }

                @Override
                public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
/* 5 */             I00000oIO().drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
                }

                @Override
                public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
/* 5 */             I00000oIO().drawLine(f, f2, f3, f4, paint);
                }

                @Override
                public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
/* 5 */             I00000oIO().drawLines(fArr, i, i2, paint);
                }

                @Override
                public final void drawOval(RectF rectF, Paint paint) {
/* 5 */             I00000oIO().drawOval(rectF, paint);
                }

                @Override
                public final void drawPaint(Paint paint) {
/* 5 */             I00000oIO().drawPaint(paint);
                }

                @Override
                public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
/* 5 */             I00000oIO().drawPatch(ninePatch, rect, paint);
                }

                @Override
                public final void drawPath(Path path, Paint paint) {
/* 5 */             I00000oIO().drawPath(path, paint);
                }

                @Override
                public final void drawPicture(Picture picture) {
/* 5 */             I00000oIO().drawPicture(picture);
                }

                @Override
                public final void drawPoint(float f, float f2, Paint paint) {
/* 5 */             I00000oIO().drawPoint(f, f2, paint);
                }

                @Override
                public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
/* 5 */             I00000oIO().drawPoints(fArr, i, i2, paint);
                }

                @Override
                public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
/* 5 */             I00000oIO().drawPosText(cArr, i, i2, fArr, paint);
                }

                @Override
                public final void drawRGB(int i, int i2, int i3) {
/* 5 */             I00000oIO().drawRGB(i, i2, i3);
                }

                @Override
                public final void drawRect(RectF rectF, Paint paint) {
/* 5 */             I00000oIO().drawRect(rectF, paint);
                }

                @Override
                public final void drawRenderNode(RenderNode renderNode) {
/* 5 */             I00000oIO().drawRenderNode(renderNode);
                }

                @Override
                public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
/* 5 */             I00000oIO().drawRoundRect(rectF, f, f2, paint);
                }

                @Override
                public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
/* 5 */             I00000oIO().drawText(cArr, i, i2, f, f2, paint);
                }

                @Override
                public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
/* 5 */             I00000oIO().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
                }

                @Override
                public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
/* 5 */             I00000oIO().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
                }

                @Override
                public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
/* 5 */             I00000oIO().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
                }

                @Override
                public final void enableZ() {
/* 5 */             I00000oIO().enableZ();
                }

                @Override
                public final boolean getClipBounds(Rect rect) {
/* 5 */             boolean clipBounds = I00000oIO().getClipBounds(rect);
/* 9 */             if (clipBounds) {
/* 19 */                rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
                    }
/* 29 */            return clipBounds;
                }

                @Override
                public final int getDensity() {
/* 5 */             return I00000oIO().getDensity();
                }

                @Override
                public final DrawFilter getDrawFilter() {
/* 5 */             return I00000oIO().getDrawFilter();
                }

                @Override
                public final int getHeight() {
/* 5 */             return I00000oIO().getHeight();
                }

                @Override
                public final void getMatrix(Matrix matrix) {
/* 5 */             I00000oIO().getMatrix(matrix);
                }

                @Override
                public final int getMaximumBitmapHeight() {
/* 5 */             return I00000oIO().getMaximumBitmapHeight();
                }

                @Override
                public final int getMaximumBitmapWidth() {
/* 5 */             return I00000oIO().getMaximumBitmapWidth();
                }

                @Override
                public final int getSaveCount() {
/* 5 */             return I00000oIO().getSaveCount();
                }

                @Override
                public final int getWidth() {
/* 5 */             return I00000oIO().getWidth();
                }

                @Override
                public final boolean isOpaque() {
/* 5 */             return I00000oIO().isOpaque();
                }

                @Override
                public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
/* 5 */             return I00000oIO().quickReject(rectF, edgeType);
                }

                @Override
                public final void restore() {
/* 5 */             I00000oIO().restore();
                }

                @Override
                public final void restoreToCount(int i) {
/* 5 */             I00000oIO().restoreToCount(i);
                }

                @Override
                public final void rotate(float f) {
/* 5 */             I00000oIO().rotate(f);
                }

                @Override
                public final int save() {
/* 5 */             return I00000oIO().save();
                }

                @Override
                public final int saveLayer(RectF rectF, Paint paint, int i) {
/* 5 */             return I00000oIO().saveLayer(rectF, paint, i);
                }

                @Override
                public final int saveLayerAlpha(RectF rectF, int i, int i2) {
/* 5 */             return I00000oIO().saveLayerAlpha(rectF, i, i2);
                }

                @Override
                public final void scale(float f, float f2) {
/* 5 */             I00000oIO().scale(f, f2);
                }

                @Override
                public final void setBitmap(Bitmap bitmap) {
/* 5 */             I00000oIO().setBitmap(bitmap);
                }

                @Override
                public final void setDensity(int i) {
/* 5 */             I00000oIO().setDensity(i);
                }

                @Override
                public final void setDrawFilter(DrawFilter drawFilter) {
/* 5 */             I00000oIO().setDrawFilter(drawFilter);
                }

                @Override
                public final void setMatrix(Matrix matrix) {
/* 5 */             I00000oIO().setMatrix(matrix);
                }

                @Override
                public final void skew(float f, float f2) {
/* 5 */             I00000oIO().skew(f, f2);
                }

                @Override
                public final void translate(float f, float f2) {
/* 5 */             I00000oIO().translate(f, f2);
                }

                @Override
/* 8 */         public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
/* 9 */             I00000oIO().drawArc(f, f2, f3, f4, f5, f6, z, paint);
                }

                @Override
/* 8 */         public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
/* 9 */             I00000oIO().drawBitmap(bitmap, rect, rectF, paint);
                }

                @Override
/* 8 */         public final void drawColor(long j) {
/* 10 */            I00000oIO().drawColor(j);
                }

                @Override
/* 8 */         public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
/* 10 */            I00000oIO().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
                }

                @Override
/* 8 */         public final void drawLines(float[] fArr, Paint paint) {
/* 9 */             I00000oIO().drawLines(fArr, paint);
                }

                @Override
/* 8 */         public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
/* 9 */             I00000oIO().drawOval(f, f2, f3, f4, paint);
                }

                @Override
/* 8 */         public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
/* 10 */            I00000oIO().drawPatch(ninePatch, rectF, paint);
                }

                @Override
/* 8 */         public final void drawPicture(Picture picture, RectF rectF) {
/* 9 */             I00000oIO().drawPicture(picture, rectF);
                }

                @Override
/* 8 */         public final void drawPoints(float[] fArr, Paint paint) {
/* 9 */             I00000oIO().drawPoints(fArr, paint);
                }

                @Override
/* 8 */         public final void drawPosText(String str, float[] fArr, Paint paint) {
/* 9 */             I00000oIO().drawPosText(str, fArr, paint);
                }

                @Override
/* 8 */         public final void drawRect(Rect rect, Paint paint) {
/* 9 */             I00000oIO().drawRect(rect, paint);
                }

                @Override
/* 8 */         public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
/* 9 */             I00000oIO().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
                }

                @Override
/* 8 */         public final void drawText(String str, float f, float f2, Paint paint) {
/* 9 */             I00000oIO().drawText(str, f, f2, paint);
                }

                @Override
/* 8 */         public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
/* 9 */             I00000oIO().drawTextOnPath(str, path, f, f2, paint);
                }

                @Override
/* 8 */         public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
/* 10 */            I00000oIO().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
                }

                @Override
/* 9 */         public final boolean clipOutRect(Rect rect) {
/* 11 */            return I00000oIO().clipOutRect(rect);
                }

                @Override
/* 9 */         public final boolean clipPath(Path path) {
/* 10 */            return I00000oIO().clipPath(path);
                }

                @Override
/* 9 */         public final boolean clipRect(Rect rect, Region.Op op) {
/* 10 */            return I00000oIO().clipRect(rect, op);
                }

                @Override
/* 9 */         public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
/* 10 */            I00000oIO().drawBitmap(bitmap, rect, rect2, paint);
                }

                @Override
/* 9 */         public final void drawPicture(Picture picture, Rect rect) {
/* 10 */            I00000oIO().drawPicture(picture, rect);
                }

                @Override
/* 9 */         public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
/* 10 */            I00000oIO().drawRect(f, f2, f3, f4, paint);
                }

                @Override
/* 9 */         public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
/* 10 */            I00000oIO().drawText(str, i, i2, f, f2, paint);
                }

                @Override
/* 9 */         public final boolean quickReject(RectF rectF) {
/* 11 */            return I00000oIO().quickReject(rectF);
                }

                @Override
/* 9 */         public final int saveLayer(RectF rectF, Paint paint) {
/* 10 */            return I00000oIO().saveLayer(rectF, paint);
                }

                @Override
/* 9 */         public final int saveLayerAlpha(RectF rectF, int i) {
/* 10 */            return I00000oIO().saveLayerAlpha(rectF, i);
                }

                @Override
/* 10 */        public final boolean clipRect(RectF rectF) {
/* 11 */            return I00000oIO().clipRect(rectF);
                }

                @Override
/* 10 */        public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
/* 11 */            I00000oIO().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
                }

                @Override
/* 10 */        public final void drawColor(int i, PorterDuff.Mode mode) {
/* 11 */            I00000oIO().drawColor(i, mode);
                }

                @Override
/* 10 */        public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
/* 11 */            I00000oIO().drawText(charSequence, i, i2, f, f2, paint);
                }

                @Override
/* 10 */        public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
/* 12 */            I00000oIO().drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
                }

                @Override
/* 10 */        public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
/* 11 */            return I00000oIO().saveLayer(f, f2, f3, f4, paint, i);
                }

                @Override
/* 10 */        public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
/* 11 */            return I00000oIO().saveLayerAlpha(f, f2, f3, f4, i, i2);
                }

                @Override
/* 11 */        public final boolean clipOutRect(float f, float f2, float f3, float f4) {
/* 13 */            return I00000oIO().clipOutRect(f, f2, f3, f4);
                }

                @Override
/* 11 */        public final boolean clipRect(Rect rect) {
/* 12 */            return I00000oIO().clipRect(rect);
                }

                @Override
/* 11 */        public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
/* 12 */            I00000oIO().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
                }

                @Override
/* 11 */        public final void drawColor(int i, BlendMode blendMode) {
/* 13 */            I00000oIO().drawColor(i, blendMode);
                }

                @Override
/* 11 */        public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
/* 12 */            return I00000oIO().quickReject(path, edgeType);
                }

                @Override
/* 11 */        public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
/* 12 */            return I00000oIO().saveLayer(f, f2, f3, f4, paint);
                }

                @Override
/* 11 */        public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
/* 12 */            return I00000oIO().saveLayerAlpha(f, f2, f3, f4, i);
                }

                @Override
/* 12 */        public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
/* 13 */            return I00000oIO().clipRect(f, f2, f3, f4, op);
                }

                @Override
/* 12 */        public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
/* 13 */            I00000oIO().drawBitmap(bitmap, matrix, paint);
                }

                @Override
/* 12 */        public final boolean quickReject(Path path) {
/* 14 */            return I00000oIO().quickReject(path);
                }

                @Override
/* 13 */        public final boolean clipOutRect(int i, int i2, int i3, int i4) {
/* 15 */            return I00000oIO().clipOutRect(i, i2, i3, i4);
                }

                @Override
/* 13 */        public final boolean clipRect(float f, float f2, float f3, float f4) {
/* 14 */            return I00000oIO().clipRect(f, f2, f3, f4);
                }

                @Override
/* 13 */        public final void drawColor(long j, BlendMode blendMode) {
/* 15 */            I00000oIO().drawColor(j, blendMode);
                }

                @Override
/* 14 */        public final boolean clipRect(int i, int i2, int i3, int i4) {
/* 15 */            return I00000oIO().clipRect(i, i2, i3, i4);
                }

                @Override
/* 14 */        public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
/* 15 */            return I00000oIO().quickReject(f, f2, f3, f4, edgeType);
                }

                @Override
/* 15 */        public final boolean quickReject(float f, float f2, float f3, float f4) {
/* 17 */            return I00000oIO().quickReject(f, f2, f3, f4);
                }
            }
