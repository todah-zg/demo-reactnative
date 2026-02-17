package io.codemagic.marijan.demo.reactnative.securepdfviewer.pdfium.shared

interface PdfViewInterface {
    val viewWidth: Int
    val viewHeight: Int
    fun invalidate()
}
