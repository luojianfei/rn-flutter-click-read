
Pod::Spec.new do |s|
  s.name         = "RNFlutterClickRead"
  s.version      = "1.0.0"
  s.summary      = "RNFlutterClickRead"
  s.description  = <<-DESC
                  RNFlutterClickRead
                   DESC
  s.homepage     = "https://github.com/luojianfei/rn-flutter-click-read.git"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNFlutterClickRead.git", :tag => "master" }
  s.source_files  = "RNFlutterClickRead/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  